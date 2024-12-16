package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.BankOfficeController;
import tech.course.zarubin.bank.model.BankOfficeDto;
import tech.course.zarubin.bank.service.BankOfficeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bank-offices")
public class BankOfficeControllerImpl implements BankOfficeController {

    private final BankOfficeService bankOfficeService;

    @Override
    @PostMapping
    public ResponseEntity<BankOfficeDto> createBankOffice(BankOfficeDto bankOfficeDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bankOfficeService.createBankOffice(bankOfficeDto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBankOffice(int id) {
        bankOfficeService.deleteBankAtm(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<BankOfficeDto> updateBankOffice(int id, String name) {
        return ResponseEntity.ok(bankOfficeService.updateBankOffice(id, name));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BankOfficeDto> getBankOfficeById(int id) {
        return ResponseEntity.ok(bankOfficeService.getBankDtoOfficeById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<BankOfficeDto>> getAllBankOffices() {
        return ResponseEntity.ok(bankOfficeService.getAllBankOffices());
    }
}
