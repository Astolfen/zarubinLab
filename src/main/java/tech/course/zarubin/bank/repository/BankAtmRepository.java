package tech.course.zarubin.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.course.zarubin.bank.entity.BankAtm;

import java.util.List;
import java.util.Optional;

public interface BankAtmRepository extends JpaRepository<BankAtm, Integer> {

    Optional<BankAtm> findById(int id);

    List<BankAtm> findAllByBankId(int id);

    void deleteById(int id);
}