package com.example.repo;

import com.example.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccineRepo extends CrudRepository<Vaccine,Integer> {

    List<Vaccine> findByName(String name);
    List<Vaccine> findByManufacturer(String manufacturer);

}
