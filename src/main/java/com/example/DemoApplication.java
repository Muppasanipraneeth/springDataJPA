package com.example;

import com.example.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DemoApplication.class, args);
        VaccineService vaccineService = container.getBean(VaccineService.class);
        vaccineService.findByCategoryIdLessThan(1773).forEach(vaccine -> System.out.println(vaccine.getName()));

    }

}
