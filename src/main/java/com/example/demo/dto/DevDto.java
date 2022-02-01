package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
public class DevDto {
    @NonNull
    String firstname;
    Integer age;
    LocalDateTime startAt;
}

