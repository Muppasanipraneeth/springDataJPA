package com.example.demo;

import com.example.doa.IEmployeeDoa;
import com.example.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DemoApplication.class, args);
        IEmployeeDoa dao = container.getBean(IEmployeeDoa.class);
        for (Employee getemployee : dao.getemployees()) {
            System.out.println(getemployee);

        }

        container.close();

	}

}
