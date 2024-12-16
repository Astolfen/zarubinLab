package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.Bank;
import tech.course.zarubin.bank.model.BankDto;
import tech.course.zarubin.bank.repository.BankRepository;
import tech.course.zarubin.bank.service.BankService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;

    @Override
    public BankDto createBank(BankDto bankDto) {
        bankRepository.save(new Bank(bankDto.getName()));
        return bankDto;
    }

    @Override
    public void deleteBank(int id) {
        bankRepository.deleteById(id);
    }

    @Override
    public BankDto updateBank(int id, String bankName) {
        var bank = bankRepository.findById(id).orElseThrow();
        bank.setName(bankName);

        return new BankDto(bankRepository.save(bank));
    }

    @Override
    public List<BankDto> getAllBanks() {
        List<BankDto> res = new ArrayList<>();
        List<Bank> response = bankRepository.findAll();
        for (Bank i : response) {
            res.add(new BankDto(i));
        }
        return res;
    }

    @Override
    public BankDto getBankDtoById(int id) {
        return new BankDto(bankRepository.findById(id).orElseThrow());
    }
}
