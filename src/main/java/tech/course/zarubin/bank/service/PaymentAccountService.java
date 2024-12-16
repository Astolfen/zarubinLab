package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.PaymentAccountDto;

import java.util.List;

public interface PaymentAccountService {
    PaymentAccountDto createPaymentAccount(PaymentAccountDto paymentAccountDto);

    void deletePaymentAccount(int id);

    PaymentAccountDto updatePaymentAccount(int id, int bankId);

    PaymentAccountDto getPaymentAccountDtoById(int id);

    List<PaymentAccountDto> getAllPaymentAccounts();
}