package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.CreditAccountController;
import tech.course.zarubin.bank.model.CreditAccountDto;
import tech.course.zarubin.bank.service.CreditAccountService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/credit-accounts")
public class CreditAccountControllerImpl implements CreditAccountController {

    private final CreditAccountService creditAccountService;

    @Override
    @PostMapping
    public ResponseEntity<CreditAccountDto> createCreditAccount(CreditAccountDto creditAccountDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(creditAccountService.createCreditAccount(creditAccountDto));
    }

    @Override
    public ResponseEntity<CreditAccountDto> createCreditAccount() {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<Void> deleteCreditAccount(int id) {
        creditAccountService.deleteCreditAccount(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<CreditAccountDto> updateCreditAccount(int id, int bankId) {
        return ResponseEntity.ok(creditAccountService.updateCreditAccount(id, bankId));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<CreditAccountDto> getBankByCreditAccount(int id) {
        return ResponseEntity.ok(creditAccountService.getCreditAccountDtoById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<CreditAccountDto>> getAllCreditAccounts() {
        return ResponseEntity.ok(creditAccountService.getAllCreditAccounts());
    }
}
