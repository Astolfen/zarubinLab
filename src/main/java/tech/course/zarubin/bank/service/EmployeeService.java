package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    void deleteEmployee(int id);

    EmployeeDto updateEmployee(int id, String name);

    EmployeeDto getEmployeeDtoById(int id);

    List<EmployeeDto> getAllEmployees();
}