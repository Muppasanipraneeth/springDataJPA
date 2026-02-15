package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Vaccines")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Integer id;
    private  String name;
    private  String description;
    private  Integer categoryId;
    private  Integer vaccineId;
    private String manufacturer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Integer vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Vaccine(){
        super();
    }
    public Vaccine(Integer id, String name, String description, Integer categoryId,Integer vaccineId, String manufacturer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.vaccineId = vaccineId;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", vaccineId=" + vaccineId +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
