package com.example.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NissanCar implements Car {

    private Integer id;
    private String model;
    private String vendor;
    private String color;

    List<String> complectation;

    @Override
    public String getCarInfo() {
        return this.vendor + " " + this.model + " " + this.color;
    }

}
