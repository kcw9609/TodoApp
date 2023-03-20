package com.example.demo.dto;

import lombok.Data;

@Data // getter, setter 설정해주는
public class TestRequestBodyDTO {
    private int id;
    private String message;

}
