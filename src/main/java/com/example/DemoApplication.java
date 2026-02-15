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
//        List<Vaccine> vaccines = new ArrayList<>();
//        vaccines.add(new Vaccine(null, "BCG", "Used to prevent tuberculosis", 1001, 5001, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "Hepatitis B", "Protects against hepatitis B virus", 1002, 5002, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "Polio", "Prevents poliomyelitis in children", 1003, 5003, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "MMR", "Protects against measles, mumps, and rubella", 1004, 5004, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "DPT", "Prevents diphtheria, pertussis, and tetanus", 1005, 5005, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "Rabies", "Used after animal bites to prevent rabies", 1006, 5006, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "Typhoid", "Prevents typhoid fever", 1007, 5007, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "Influenza", "Protects against seasonal flu virus", 1008, 5008, "DR. Praneeth"));
//        vaccines.add(new Vaccine(null, "COVID-19", "Prevents coronavirus infection", 1009, 5009, "DR. Praneeth"));
//
//        vaccines.add(new Vaccine(null, "Tetanus", "Prevents tetanus infection from wounds", 1010, 5010, "DR. Praneeth"));
        // saving all the vaccines
//        Iterable<Vaccine> data = vaccineService.RegisterAll(vaccines);
//        System.out.println("New Data is created"+data);

        // updating the vaccine information
//        Vaccine data = vaccineService.UpdateVaccine(new Vaccine(111, "Tetanus", "Prevents tetanus infection from wounds", 1212, 9010, " DR. Suresh"));
//        System.out.println(data+"updated value");
//        System.out.println(vaccineService.countVaccines()+"count of the Vaccines");
//        System.out.println(vaccineService.GetVaccineByName("polio")+"vaccine by name");
        System.out.println(vaccineService.GetVaccineByManufacturer(" DR. Suresh")+"output");

	}

}
