package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport, String> {

}

