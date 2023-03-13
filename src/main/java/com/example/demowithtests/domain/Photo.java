package com.example.demowithtests.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
@Entity
@Table(name = "photos")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String linkPhoto;
    private Integer xHigh;
    private Integer yLength;
    private Date createDate= Date.from(Instant.now());

    private Boolean isVisible = Boolean.TRUE;

}
