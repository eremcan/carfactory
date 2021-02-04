package com.factory.vehicles.cars.service;

import com.factory.vehicles.cars.exception.UnknownCarTypeException;
import com.factory.vehicles.cars.factory.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class CarServiceFactory {
    private static final Map<String, Car> carService = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    private static final String PRODUCED = " Car has produced.";

    @Autowired
    public CarServiceFactory(List<Car> carServiceList) {
        for (Car car : carServiceList) {
            carService.put(car.getType(), car);
        }
    }

    public static String getCarService(String type) {
        Car car = carService.get(type);
        if (car == null) throw new UnknownCarTypeException();
        return car.getType().concat(PRODUCED);

    }

}
