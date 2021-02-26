package com.humanbooster.examRestFayolleAlexandre.controller;

import com.humanbooster.examRestFayolleAlexandre.model.Car;
import com.humanbooster.examRestFayolleAlexandre.model.Color;
import com.humanbooster.examRestFayolleAlexandre.repo.CarRepository;
import com.humanbooster.examRestFayolleAlexandre.repo.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorController {

    @Autowired
    private ColorRepository colorRepository;

    /* Find all colors */
    @GetMapping("/")
    List<Color> getAll(){
        return colorRepository.findAll();
    }

    /* Add a color */
    @PostMapping(value = "/", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Color> saveCar(@Valid @RequestBody Color color){

        this.colorRepository.save(color);
        return new ResponseEntity<Color>(color, HttpStatus.CREATED);
    }

    /* Get by id */
    @GetMapping(value = "/{id}", produces = {"application/json"})
    Color getOne(@PathVariable(name = "id", required = false) Color color){
        if(color == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Couleur Introuvable");
        }else{
            return color;
        }
    }

    /* Update by id */
    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Color> editColor(@PathVariable(name = "id", required = false) Color color,
                                                 @Valid @RequestBody Color colorUpdated){
        if(color == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Couleur Introuvable");
        }

        colorUpdated.setId(color.getId());
        this.colorRepository.save(colorUpdated);

        return new ResponseEntity<Color>(colorUpdated, HttpStatus.CREATED);

    }

    /* Delete by id */
    @DeleteMapping(value = "/{id}", produces = "application/json")
    void deleteColor(@PathVariable(name = "id", required = false) Color color){
        if(color == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Couleur Introuvable");
        }else{
            this.colorRepository.delete(color);
        }
    }
}
