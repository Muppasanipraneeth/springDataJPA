package com.example.service;

import com.example.entity.Vaccine;
import com.example.repo.VaccineRepo;
import com.example.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService implements VaccineServiceInterface {
    private VaccineRepo vaccineRepo;
    @Autowired
    public void setVaccineRepo(VaccineRepo vaccineRepo) {
       this.vaccineRepo = vaccineRepo;
    }
    @Override
    public List<ResultView> findByCategoryIdLessThan(Integer categoryId) {
        return vaccineRepo.findByCategoryIdLessThan(categoryId);
    }
}
