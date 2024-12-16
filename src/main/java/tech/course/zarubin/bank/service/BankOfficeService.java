package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.BankOfficeDto;

import java.util.List;

public interface BankOfficeService {

    BankOfficeDto createBankOffice(BankOfficeDto bankOfficeDto);

    void deleteBankAtm(int id);

    BankOfficeDto updateBankOffice(int id, String name);

    BankOfficeDto getBankDtoOfficeById(int id);

    List<BankOfficeDto> getAllBankOffices();
}