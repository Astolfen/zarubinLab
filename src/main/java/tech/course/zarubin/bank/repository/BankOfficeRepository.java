package tech.course.zarubin.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.course.zarubin.bank.entity.BankOffice;

import java.util.Optional;

public interface BankOfficeRepository extends JpaRepository<BankOffice, Integer> {

    Optional<BankOffice> findById(int id);

    void deleteById(int id);

}