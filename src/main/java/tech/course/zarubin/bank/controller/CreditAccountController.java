package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.CreditAccountDto;

import java.util.List;

public interface CreditAccountController {

    ResponseEntity<CreditAccountDto> createCreditAccount(@RequestBody CreditAccountDto creditAccountDto);

    ResponseEntity<Void> deleteCreditAccount(@PathVariable int id);

    ResponseEntity<CreditAccountDto> updateCreditAccount(@PathVariable int id, @RequestParam(name = "bankId") int bankId);

    ResponseEntity<CreditAccountDto> getBankByCreditAccount(@PathVariable int id);

    ResponseEntity<List<CreditAccountDto>> getAllCreditAccounts();
}
