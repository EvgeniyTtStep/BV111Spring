package com.example.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MercedesCar implements Car {

    private Integer id;
    private String name;

    private String color;

    Map<String, Integer> map;


    @Override
    public String getCarInfo() {
        return this.id + " " + this.name + " " + this.color;
    }
}
