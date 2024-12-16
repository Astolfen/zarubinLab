package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.BankDto;

import java.util.List;

public interface BankController {

    ResponseEntity<BankDto> createBank(@RequestParam(name = "bankName") String bankName);

    ResponseEntity<Void> deleteBank(@PathVariable int id);

    ResponseEntity<BankDto> updateBank(@PathVariable int id, @RequestParam(name = "bankName") String bankName);

    ResponseEntity<BankDto> getBankById(@PathVariable int id);

    ResponseEntity<List<BankDto>> getAllBanks();
}
