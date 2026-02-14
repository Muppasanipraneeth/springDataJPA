package com.example;

import com.example.entity.Alien;
import com.example.repo.IAlien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DATAJPARunner implements CommandLineRunner {
    @Autowired
 private IAlien alien;
    @Override
    public void run(String... args) throws Exception {
       alien.save(new Alien(1,"praneeth",21,"praneeth7077@gmail.com","kurnool","052904603"));

    }
}
