package tech.course.zarubin.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.course.zarubin.bank.entity.Employee;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private String fullName;
    private LocalDate birthDate;
    private String position;
    private int bankId;
    private boolean remoteWork;
    private int bankOfficeId;
    private boolean canIssueLoans;
    private double salary;

    public EmployeeDto(Employee employee) {
        this.fullName = employee.getFullName();
        this.birthDate = employee.getBirthDate();
        this.position = employee.getPosition();
        this.bankId = employee.getBank().getId();
        this.remoteWork = employee.isRemoteWork();
        this.bankOfficeId = employee.getBankOffice().getId();
        this.canIssueLoans = employee.isCanIssueLoans();
        this.salary = employee.getSalary();
    }
}
