package com.factory.vehicles.cars.controller;

import com.factory.vehicles.cars.service.CarServiceFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/v1/car/{type}")
    public ResponseEntity<String> getCarByType(@PathVariable String type) {
        String producedCar = CarServiceFactory.getCarService(type);
        return new ResponseEntity<>(producedCar, HttpStatus.OK);
    }
}
