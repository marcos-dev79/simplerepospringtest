package com.itssince79.demo.controllers;

import com.itssince79.demo.domain.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalController {
    @GetMapping(value = "/animal")
    public List<Animal> listAnimal(){
        Animal animal = new Animal("Cachorro", "Branco");
        Animal animal2 = new Animal("Gato", "Pardo");
        Animal animal3 = new Animal("Ovelha", "Negra");

        List<Animal> animais = new ArrayList();
        animais.add(animal);
        animais.add(animal2);
        animais.add(animal3);

        return animais;
    }
}
