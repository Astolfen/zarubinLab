package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.BankAtmController;
import tech.course.zarubin.bank.model.BankAtmDto;
import tech.course.zarubin.bank.service.BankAtmService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bank-atms")
public class BankAtmControllerImpl implements BankAtmController {

    private final BankAtmService bankAtmService;

    @Override
    @PostMapping
    public ResponseEntity<BankAtmDto> createBankAtm(BankAtmDto bankAtmDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bankAtmService.createBankAtm(bankAtmDto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBankAtm(int id) {
        bankAtmService.deleteBankAtm(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<BankAtmDto> updateBankAtm(int id, String name) {
        return ResponseEntity.ok(bankAtmService.updateBankAtm(id, name));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BankAtmDto> getBankAtmById(int id) {
        return ResponseEntity.ok(bankAtmService.getBankAtmDtoById(id));
    }

    @Override
    @GetMapping("/all-by-bank/{bankId}")
    public ResponseEntity<List<BankAtmDto>> getAllBankAtmByBankId(int bankId) {
        return ResponseEntity.ok(bankAtmService.getAllBankAtmsByBankId(bankId));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<BankAtmDto>> getAllBankAtms() {
        return ResponseEntity.ok(bankAtmService.getAllBankAtms());
    }
}
