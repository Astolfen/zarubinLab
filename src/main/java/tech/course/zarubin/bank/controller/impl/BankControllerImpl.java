package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.BankController;
import tech.course.zarubin.bank.model.BankDto;
import tech.course.zarubin.bank.service.BankService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/banks")
public class BankControllerImpl implements BankController {

    private final BankService bankService;

    @Override
    @PostMapping
    public ResponseEntity<BankDto> createBank(String bankName) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bankService.createBank(new BankDto(bankName)));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBank(int id) {
        bankService.deleteBank(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<BankDto> updateBank(int id, String bankName) {
        return ResponseEntity.ok(bankService.updateBank(id, bankName));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BankDto> getBankById(int id) {
        return ResponseEntity.ok(bankService.getBankDtoById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<BankDto>> getAllBanks() {
        return ResponseEntity.ok(bankService.getAllBanks());
    }
}
