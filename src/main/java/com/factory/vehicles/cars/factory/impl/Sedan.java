package com.factory.vehicles.cars.factory.impl;

import com.factory.vehicles.cars.factory.Car;
import org.springframework.stereotype.Component;

@Component
public class Sedan implements Car {
    @Override
    public String getType() {
        return "Sedan";
    }

}