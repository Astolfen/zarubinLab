package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.BankOffice;
import tech.course.zarubin.bank.model.BankOfficeDto;
import tech.course.zarubin.bank.repository.BankOfficeRepository;
import tech.course.zarubin.bank.repository.BankRepository;
import tech.course.zarubin.bank.service.BankOfficeService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BankOfficeServiceImpl implements BankOfficeService {
    private final BankOfficeRepository bankOfficeRepository;
    private final BankRepository bankRepository;

    @Override
    public BankOfficeDto createBankOffice(BankOfficeDto bankOfficeDto) {
        bankOfficeRepository.save(
                new BankOffice(
                        bankOfficeDto.getName(),
                        bankOfficeDto.getAddress(),
                        bankOfficeDto.isCanPlaceAtm(),
                        bankOfficeDto.isCanIssueLoan(),
                        bankOfficeDto.isCashWithdrawal(),
                        bankOfficeDto.isCashDeposit(),
                        bankOfficeDto.getRentCost(),
                        bankRepository.findById(bankOfficeDto.getBankId()).orElseThrow()
                )
        );
        return bankOfficeDto;
    }

    @Override
    public void deleteBankAtm(int id) {
        bankOfficeRepository.deleteById(id);
    }

    @Override
    public BankOfficeDto updateBankOffice(int id, String name) {
        var bankOffice = bankOfficeRepository.findById(id).orElseThrow();
        bankOffice.setName(name);

        return new BankOfficeDto(bankOfficeRepository.save(bankOffice));
    }

    @Override
    public BankOfficeDto getBankDtoOfficeById(int id) {
        return new BankOfficeDto(bankOfficeRepository.findById(id).orElseThrow());
    }

    @Override
    public List<BankOfficeDto> getAllBankOffices() {
        List<BankOfficeDto> res = new ArrayList<>();
        List<BankOffice> response = bankOfficeRepository.findAll();
        for (BankOffice i : response) {
            res.add(new BankOfficeDto(i));
        }
        return res;
    }
}
