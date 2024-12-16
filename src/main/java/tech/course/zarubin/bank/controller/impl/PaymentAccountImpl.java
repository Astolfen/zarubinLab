package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.PaymentAccountController;
import tech.course.zarubin.bank.model.PaymentAccountDto;
import tech.course.zarubin.bank.service.PaymentAccountService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment-accounts")
public class PaymentAccountImpl implements PaymentAccountController {

    private final PaymentAccountService paymentAccountService;

    @Override
    @PostMapping
    public ResponseEntity<PaymentAccountDto> createPaymentAccount(PaymentAccountDto paymentAccountDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentAccountService.createPaymentAccount(paymentAccountDto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaymentAccount(int id) {
        paymentAccountService.deletePaymentAccount(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<PaymentAccountDto> updatePaymentAccount(int id, int bankId) {
        return ResponseEntity.ok(paymentAccountService.updatePaymentAccount(id, bankId));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<PaymentAccountDto> getBankByPaymentAccount(int id) {
        return ResponseEntity.ok(paymentAccountService.getPaymentAccountDtoById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<PaymentAccountDto>> getAllPaymentAccounts() {
        return ResponseEntity.ok(paymentAccountService.getAllPaymentAccounts());
    }
}
