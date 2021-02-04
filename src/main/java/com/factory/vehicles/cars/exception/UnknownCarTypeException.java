package com.factory.vehicles.cars.exception;

public class UnknownCarTypeException extends RuntimeException {
    public static final String UNKNOWN_CAR_TYPE = "Unknown car Type";

    public UnknownCarTypeException() {
        super(UNKNOWN_CAR_TYPE);
    }
}
