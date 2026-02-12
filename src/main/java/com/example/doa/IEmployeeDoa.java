package com.example.doa;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

@Repository("dao")
public class IEmployeeDoa implements Iemploye{


    private static final String MYSQL_QURIES ="SELECT * FROM Employee";
    ArrayList<Employee> employees = null;
    @Autowired
    private DataSource dataSource;
    @Override
    public ArrayList<Employee> getemployees() {
       try{
     Connection connection= dataSource.getConnection();
           PreparedStatement prsp = connection.prepareStatement(MYSQL_QURIES);
        employees=new ArrayList<>();
        ResultSet resultSet = prsp.executeQuery();
        while (resultSet.next()){

            Employee employee = new Employee();
            employee.setFirstName(resultSet.getString("firstName"));
            employee.setLastName(resultSet.getString("lastName"));
            employee.setEmail(resultSet.getString("email"));
            employee.setPassword(resultSet.getString("password"));
            employees.add(employee);

        }


       }catch(Exception e){
           e.printStackTrace();

       }
       return employees;
    }


}
