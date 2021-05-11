package com.brito.eliseu.citiesapi.repository;

import com.brito.eliseu.citiesapi.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
