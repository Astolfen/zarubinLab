package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.BankOfficeDto;

import java.util.List;

public interface BankOfficeController {

    ResponseEntity<BankOfficeDto> createBankOffice(@RequestBody BankOfficeDto bankOfficeDto);

    ResponseEntity<Void> deleteBankOffice(@PathVariable int id);

    ResponseEntity<BankOfficeDto> updateBankOffice(@PathVariable int id, @RequestParam(name = "name") String name);

    ResponseEntity<BankOfficeDto> getBankOfficeById(@PathVariable int id);

    ResponseEntity<List<BankOfficeDto>> getAllBankOffices();
}