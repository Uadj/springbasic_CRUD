package com.example.demo.dto;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class DevDtoTest {
    @Test
    void test(){
        DevDto devDto = new DevDto();

        devDto.setFirstname("snow");
        devDto.setAge(21);
        devDto.setStartAt(LocalDateTime.now());
        System.out.println(devDto.getStartAt());
    }
}
