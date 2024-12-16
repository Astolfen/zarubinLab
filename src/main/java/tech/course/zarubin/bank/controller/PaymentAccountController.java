package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.PaymentAccountDto;

import java.util.List;

public interface PaymentAccountController {

    ResponseEntity<PaymentAccountDto> createPaymentAccount(@RequestBody PaymentAccountDto paymentAccountDto);

    ResponseEntity<Void> deletePaymentAccount(@PathVariable int id);

    ResponseEntity<PaymentAccountDto> updatePaymentAccount(@PathVariable int id, @RequestParam(name = "bankId") int bankId);

    ResponseEntity<PaymentAccountDto> getBankByPaymentAccount(@PathVariable int id);

    ResponseEntity<List<PaymentAccountDto>> getAllPaymentAccounts();
}