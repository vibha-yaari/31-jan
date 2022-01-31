package com.details.employeedetails.service;

import com.details.employeedetails.modal.Employee;
import com.details.employeedetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSerImp  {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee) ;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public Employee get(Integer id){
        return employeeRepository.findById(id).get();
    }
    public void delete(Integer id){
        employeeRepository.deleteById(id);
    }

    public void save(Employee employee) {

    }
}
