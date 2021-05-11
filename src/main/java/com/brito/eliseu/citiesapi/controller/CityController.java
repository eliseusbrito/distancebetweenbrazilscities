package com.brito.eliseu.citiesapi.controller;

import com.brito.eliseu.citiesapi.domain.City;
import com.brito.eliseu.citiesapi.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityController {

    private final CityRepository repository;

    public CityController(CityRepository repository) {
        this.repository = repository;
    }

  @GetMapping
  public Page<City> cities(final Pageable page) {
      return repository.findAll(page);
  }


}
