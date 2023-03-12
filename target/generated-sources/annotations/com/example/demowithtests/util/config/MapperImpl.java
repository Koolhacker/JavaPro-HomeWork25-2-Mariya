package com.example.demowithtests.util.config;

import com.example.demowithtests.domain.Employee;
import com.example.demowithtests.dto.EmployeeDto;
import com.example.demowithtests.dto.EmployeeReadDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-12T17:19:50+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class MapperImpl implements Mapper {

    @Override
    public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        String name = null;
        String country = null;
        String email = null;

        name = employeeDto.name;
        country = employeeDto.country;
        email = employeeDto.email;

        Employee employee = new Employee( name, country, email );

        return employee;
    }

    @Override
    public EmployeeDto employeeToEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.name = employee.getName();
        employeeDto.country = employee.getCountry();
        employeeDto.email = employee.getEmail();

        return employeeDto;
    }

    @Override
    public EmployeeReadDto employeeToEmployeeReadDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeReadDto employeeReadDto = new EmployeeReadDto();

        employeeReadDto.name = employee.getName();
        employeeReadDto.email = employee.getEmail();

        return employeeReadDto;
    }

    @Override
    public Employee employeeReadDtoToEmployee(EmployeeReadDto employeeReadDto) {
        if ( employeeReadDto == null ) {
            return null;
        }

        String name = null;
        String email = null;

        name = employeeReadDto.name;
        email = employeeReadDto.email;

        String country = null;

        Employee employee = new Employee( name, country, email );

        return employee;
    }
}
