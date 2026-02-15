package com.example.repo;

import com.example.entity.Vaccine;
import com.example.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccineRepo extends JpaRepository<Vaccine, Integer> {
  List<ResultView>findByCategoryIdLessThan(Integer categoryId);

}
