package com.example.service;

import com.example.entity.Vaccine;
import com.example.repo.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements VaccineServiceInterface {
    private VaccineRepo vaccineRepo;
    @Autowired
    public void setVaccineRepo(VaccineRepo vaccineRepo) {
       this.vaccineRepo = vaccineRepo;
    }
    @Override
    public Vaccine Register(Vaccine vaccine) {
       return vaccineRepo.save(vaccine);

    }

    @Override
    public Iterable<Vaccine> RegisterAll(Iterable<Vaccine> vaccines) {
       return vaccineRepo.saveAll(vaccines);
    }

    @Override
    public Vaccine GetVaccine(Integer vaccineId) {
        if( vaccineRepo.findById(vaccineId).isPresent()){
            return vaccineRepo.findById(vaccineId).get();

        }
        return null;

    }

    @Override
    public Iterable<Vaccine> GetAllVaccines() {
        return vaccineRepo.findAll();
    }

    @Override
    public int countVaccines() {

        return (int) vaccineRepo.count();
    }

    @Override
    public void DeleteVaccine(Integer vaccineId) {
        vaccineRepo.deleteById(vaccineId);

    }

    @Override
    public Vaccine UpdateVaccine(Vaccine vaccine) {
       return  vaccineRepo.save(vaccine);
    }

    @Override
    public List<Vaccine> GetVaccineByName(String vaccineName) {

        return  vaccineRepo.findByName(vaccineName);
    }

    @Override
    public List<Vaccine> GetVaccineByManufacturer(String Manufacturer) {
        return    vaccineRepo.findByManufacturer(Manufacturer);
    }
}
