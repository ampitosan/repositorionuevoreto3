package com.example.reto3proyecto.Controller;

import com.example.reto3proyecto.Entities.Bike;
import com.example.reto3proyecto.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Bike")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/all")
    public List<Bike> getAll(){return bikeService.getAll();}
    @GetMapping("/{id}")
    public Optional<Bike> getBike(@PathVariable("id") int id){
        return bikeService.getBike(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike save (@RequestBody Bike bike){
        return bikeService.save(bike);
    }
}

