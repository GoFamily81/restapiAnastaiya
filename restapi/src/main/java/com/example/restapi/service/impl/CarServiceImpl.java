package com.example.restapi.service.impl;

import com.example.restapi.repository.CarRepository;
import com.example.restapi.service.CarService;
import com.example.restapi.user.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCarById(Integer carId) {

        return carRepository.getById(carId);
    }

    @Override
    public String deleteCarById(Integer carId) {
        carRepository.deleteById(carId);
        return "User with id " + carId + " has been deleted";
    }

    @Override
    public Car putCarById(Integer carId, Car car) {
        car.setId(carId);
        carRepository.save(car);
        return getCarById(carId);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
