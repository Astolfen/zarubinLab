package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.BankAtmDto;

import java.util.List;

public interface BankAtmService {

    BankAtmDto createBankAtm(BankAtmDto bankAtmDto);

    void deleteBankAtm(int id);

    BankAtmDto updateBankAtm(int id, String name);

    BankAtmDto getBankAtmDtoById(int id);

    List<BankAtmDto> getAllBankAtmsByBankId(int bankId);

    List<BankAtmDto> getAllBankAtms();
}