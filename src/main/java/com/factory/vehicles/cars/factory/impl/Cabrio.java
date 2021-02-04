package com.factory.vehicles.cars.factory.impl;

import com.factory.vehicles.cars.factory.Car;
import org.springframework.stereotype.Component;

@Component
public class Cabrio implements Car {
    @Override
    public String getType() {
        return "Cabrio";
    }
}
