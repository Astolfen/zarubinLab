package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.BankDto;

import java.util.List;

public interface BankService {
    BankDto createBank(BankDto bankDto);

    void deleteBank(int id);

    BankDto updateBank(int id, String bankName);

    List<BankDto> getAllBanks();

    BankDto getBankDtoById(int id);
}