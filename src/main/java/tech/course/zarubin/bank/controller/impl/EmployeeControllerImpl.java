package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.EmployeeController;
import tech.course.zarubin.bank.model.EmployeeDto;
import tech.course.zarubin.bank.service.EmployeeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeControllerImpl implements EmployeeController {

    private final EmployeeService employeeService;

    @Override
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(EmployeeDto employeeDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employeeDto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(int id, String name) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, name));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(int id) {
        return ResponseEntity.ok(employeeService.getEmployeeDtoById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }
}
