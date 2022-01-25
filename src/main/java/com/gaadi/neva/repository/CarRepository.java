package com.gaadi.neva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gaadi.neva.entity.Car;


@CrossOrigin
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer>{

}
