package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.Employee;
import tech.course.zarubin.bank.model.EmployeeDto;
import tech.course.zarubin.bank.repository.BankOfficeRepository;
import tech.course.zarubin.bank.repository.BankRepository;
import tech.course.zarubin.bank.repository.EmployeeRepository;
import tech.course.zarubin.bank.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final BankRepository bankRepository;
    private final BankOfficeRepository bankOfficeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        employeeRepository.save(
                new Employee(
                        employeeDto.getFullName(),
                        employeeDto.getBirthDate(),
                        employeeDto.getPosition(),
                        bankRepository.findById(employeeDto.getBankId()).orElseThrow(),
                        employeeDto.isRemoteWork(),
                        bankOfficeRepository.findById(employeeDto.getBankOfficeId()).orElseThrow(),
                        employeeDto.isCanIssueLoans(),
                        employeeDto.getSalary()
                )
        );
        return employeeDto;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto updateEmployee(int id, String name) {
        var employee = employeeRepository.findById(id).orElseThrow();
        employee.setFullName(name);

        return new EmployeeDto(employeeRepository.save(employee));
    }

    @Override
    public EmployeeDto getEmployeeDtoById(int id) {
        return new EmployeeDto(employeeRepository.findById(id).orElseThrow());
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> res = new ArrayList<>();
        List<Employee> response = employeeRepository.findAll();
        for (Employee i : response) {
            res.add(new EmployeeDto(i));
        }
        return res;
    }
}