package com.feelway.programming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HappyNewYearPostDto {
    private String name;
    private String relation;
    private String tel;
    private String birth;
    private String msg;
}
