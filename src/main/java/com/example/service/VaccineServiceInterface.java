package com.example.service;

import com.example.entity.Vaccine;
import com.example.view.ResultView;

import java.util.List;
import java.util.Optional;

public interface VaccineServiceInterface {
    public List<ResultView> findByCategoryIdLessThan(Integer categoryId);

}
