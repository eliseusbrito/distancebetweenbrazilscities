package com.brito.eliseu.citiesapi.repository;

import com.brito.eliseu.citiesapi.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
