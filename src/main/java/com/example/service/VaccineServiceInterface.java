package com.example.service;

import com.example.entity.Vaccine;

import java.util.List;

public interface VaccineServiceInterface {
    public Vaccine Register(Vaccine vaccine);
    public Iterable<Vaccine> RegisterAll( Iterable<Vaccine> vaccines );
    public Vaccine GetVaccine(Integer vaccineId);
    public Iterable<Vaccine> GetAllVaccines();
    public int countVaccines();
    public void DeleteVaccine(Integer vaccineId);
    public Vaccine UpdateVaccine(Vaccine vaccine);
    public  List<Vaccine> GetVaccineByName(String vaccineName);
    public  List<Vaccine> GetVaccineByManufacturer(String Manufacturer);
}
