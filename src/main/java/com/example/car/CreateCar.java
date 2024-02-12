package com.example.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCar {

    private Car car; // Dependency injection

    public CreateCar() {
    }

}
