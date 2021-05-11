package com.brito.eliseu.citiesapi.controller;

import com.brito.eliseu.citiesapi.domain.State;
import com.brito.eliseu.citiesapi.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateController {

    private final StateRepository repository;

    public StateController(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }

}
