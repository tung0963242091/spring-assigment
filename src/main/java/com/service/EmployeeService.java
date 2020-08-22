package com.service;

import com.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    Page<Employee> getAllEmployees(int page, int limit);
    void createEmp(Employee employee);
    void updateEmp(Employee employee);
    void deleteEmp(Integer id);
    Employee getDetailEmp(Integer id);
    List<Employee> searchByName(String q);
}
