package com.example.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//var1
//        Car nissan = new NissanCar(1, "x-trail", "nissan", "black", new ArrayList<>());
//
//        CreateCar carNissan = new CreateCar();
//        carNissan.setCar(nissan);
//
//        System.out.println(carNissan.getCar().getCarInfo());

//var2

//        CarInit.initCar();
//        CreateCar createCar = CarInit.initCreateCar();
//        System.out.println(createCar.getCar().getCarInfo());


//var3
        ApplicationContext context = new ClassPathXmlApplicationContext("car-context.xml");
        CreateCar createCar = context.getBean("createCar", CreateCar.class);
        System.out.println(createCar.getCar().getCarInfo());

    }
}
