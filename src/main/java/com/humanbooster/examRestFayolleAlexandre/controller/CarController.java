package com.humanbooster.examRestFayolleAlexandre.controller;

import com.humanbooster.examRestFayolleAlexandre.model.Car;
import com.humanbooster.examRestFayolleAlexandre.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    /* Find all car */
    @GetMapping("/")
    List<Car> getAll(){
        return carRepository.findAll();
    }

    /* Add a car */
    @PostMapping(value = "/", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Car> saveCar(@Valid @RequestBody Car car){

        this.carRepository.save(car);
        return new ResponseEntity<Car>(car, HttpStatus.CREATED);
    }

    /* Get by id */
    @GetMapping(value = "/{id}", produces = {"application/json"})
    Car getOne(@PathVariable(name = "id", required = false) Car car){
        if(car == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Voiture Introuvable");
        }else{
            return car;
        }
    }
}
