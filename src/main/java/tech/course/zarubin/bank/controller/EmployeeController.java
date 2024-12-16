package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.EmployeeDto;

import java.util.List;

public interface EmployeeController {

    ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto);

    ResponseEntity<Void> deleteEmployee(@PathVariable int id);

    ResponseEntity<EmployeeDto> updateEmployee(@PathVariable int id, @RequestParam(name = "name") String name);

    ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable int id);

    ResponseEntity<List<EmployeeDto>> getAllEmployees();
}
