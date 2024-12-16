package tech.course.zarubin.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.course.zarubin.bank.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findById(int id);

    void deleteById(int id);
}