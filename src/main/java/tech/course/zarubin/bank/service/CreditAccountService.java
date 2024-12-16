package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.CreditAccountDto;

import java.util.List;

public interface CreditAccountService {
    CreditAccountDto createCreditAccount(CreditAccountDto creditAccountDto);

    void deleteCreditAccount(int id);

    CreditAccountDto updateCreditAccount(int id, int bankId);

    CreditAccountDto getCreditAccountDtoById(int id);

    List<CreditAccountDto> getAllCreditAccounts();
}
