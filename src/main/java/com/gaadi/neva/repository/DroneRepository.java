package com.gaadi.neva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gaadi.neva.entity.Drone;

@CrossOrigin
@RepositoryRestResource
public interface DroneRepository extends JpaRepository<Drone, Integer> {

}
