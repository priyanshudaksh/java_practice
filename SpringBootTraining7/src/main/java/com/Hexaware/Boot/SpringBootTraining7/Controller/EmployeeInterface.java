package com.Hexaware.Boot.SpringBootTraining7.Controller;

import org.springframework.data.repository.CrudRepository;

import com.Hexaware.Boot.SpringBootTraining7.Model.Employee;

public interface EmployeeInterface extends CrudRepository<Employee, Integer> {

}
