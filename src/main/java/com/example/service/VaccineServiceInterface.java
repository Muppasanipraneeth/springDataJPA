package com.example.service;

import com.example.view.ResultView;

import java.util.List;

public interface VaccineServiceInterface {
    public List<ResultView> findByCategoryId(Integer categoryId);

}
