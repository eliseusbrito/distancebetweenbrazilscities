package com.brito.eliseu.citiesapi.controller;

import com.brito.eliseu.citiesapi.domain.Country;
import com.brito.eliseu.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResourceController {

    private CountryRepository repository;

    public CountryResourceController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }

}
