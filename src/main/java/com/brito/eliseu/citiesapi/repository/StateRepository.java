package com.brito.eliseu.citiesapi.repository;

import com.brito.eliseu.citiesapi.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
