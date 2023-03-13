package com.example.demowithtests.dto;

import java.time.Instant;
import java.util.Date;

public class PhotoDto {

    public Integer id;
    public String linkPhoto;
    public Integer xHigh;
    public Integer yLength;
    public Date createDate= Date.from(Instant.now());

    public Boolean isVisible = Boolean.TRUE;
}
