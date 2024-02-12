package com.example.car;

import java.util.HashMap;

public class CarInit {

    static Car car;

    static CreateCar createCar;


    public static Car initCar() {
        return car = new MercedesCar(1, "mercedes", "red", new HashMap<>());
    }

    public static CreateCar initCreateCar() {
        createCar = new CreateCar();
        createCar.setCar(car);
        return createCar;
    }

}
