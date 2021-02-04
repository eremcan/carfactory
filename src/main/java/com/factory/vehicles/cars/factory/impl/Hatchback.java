package com.factory.vehicles.cars.factory.impl;

import com.factory.vehicles.cars.factory.Car;
import org.springframework.stereotype.Component;

@Component
public class Hatchback implements Car {

    @Override
    public String getType() {
        return "Hatchback";
    }
}
