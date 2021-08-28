package com.github.deivisdf.citiesapi.countries.repositories;

import com.github.deivisdf.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
