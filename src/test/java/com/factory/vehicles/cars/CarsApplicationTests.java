package com.factory.vehicles.cars;

import com.factory.vehicles.cars.factory.Car;
import com.factory.vehicles.cars.factory.impl.Cabrio;
import com.factory.vehicles.cars.factory.impl.Hatchback;
import com.factory.vehicles.cars.factory.impl.Sedan;
import com.factory.vehicles.cars.service.CarServiceFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CarsApplicationTests {

    @Test
    public void testCarFactory() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Sedan());
        carList.add(new Hatchback());
        carList.add(new Cabrio());
        CarServiceFactory carServiceFactory = new CarServiceFactory(carList);
        String result = carServiceFactory.getCarService("sedan");
        assertEquals(result, "Sedan Car has produced.");
    }

    @Test
    public void testCarFactoryIgnoreCase() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Sedan());
        carList.add(new Hatchback());
        carList.add(new Cabrio());
        CarServiceFactory carServiceFactory = new CarServiceFactory(carList);
        String result = carServiceFactory.getCarService("Sedan");
        assertEquals(result, "Sedan Car has produced.");
    }
}
