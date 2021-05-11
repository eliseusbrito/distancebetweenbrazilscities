package com.brito.eliseu.citiesapi.controller;

import com.brito.eliseu.citiesapi.domain.City;
import com.brito.eliseu.citiesapi.repository.CityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cities")
public class CityController {

    private final CityRepository repository;

    public CityController(CityRepository repository) {
        this.repository = repository;
    }

  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }


}
