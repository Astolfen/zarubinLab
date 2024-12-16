package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.BankAtmDto;

import java.util.List;

public interface BankAtmController {

    ResponseEntity<BankAtmDto> createBankAtm(@RequestBody BankAtmDto bankAtmDto);

    ResponseEntity<Void> deleteBankAtm(@PathVariable int id);

    ResponseEntity<BankAtmDto> updateBankAtm(@PathVariable int id, @RequestParam(name = "name") String name);

    ResponseEntity<BankAtmDto> getBankAtmById(@PathVariable int id);

    ResponseEntity<List<BankAtmDto>> getAllBankAtmByBankId(@PathVariable int bankId);

    ResponseEntity<List<BankAtmDto>> getAllBankAtms();
}