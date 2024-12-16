package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.BankAtm;
import tech.course.zarubin.bank.model.BankAtmDto;
import tech.course.zarubin.bank.repository.*;
import tech.course.zarubin.bank.service.BankAtmService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BankAtmServiceImpl implements BankAtmService {
    private final BankRepository bankRepository;
    private final BankOfficeRepository bankOfficeRepository;
    private final EmployeeRepository employeeRepository;
    private final BankAtmRepository bankAtmRepository;

    @Override
    public BankAtmDto createBankAtm(BankAtmDto bankAtmDto) {
        bankAtmRepository.save(
                new BankAtm(
                        bankAtmDto.getName(),
                        bankAtmDto.getAddress(),
                        bankRepository.findById(bankAtmDto.getBankId()).orElseThrow(),
                        bankOfficeRepository.findById(bankAtmDto.getLocationId()).orElseThrow(),
                        employeeRepository.findById(bankAtmDto.getEmployeeId()).orElseThrow(),
                        bankAtmDto.isCashWithdrawal(),
                        bankAtmDto.isCashDeposit(),
                        bankAtmDto.getMaintenanceCost()

                )
        );
        return bankAtmDto;
    }

    @Override
    public void deleteBankAtm(int id) {
        bankAtmRepository.deleteById(id);
    }

    @Override
    public BankAtmDto updateBankAtm(int id, String name) {
        var bankAtm = bankAtmRepository.findById(id).orElseThrow();
        bankAtm.setName(name);

        return new BankAtmDto(bankAtmRepository.save(bankAtm));
    }

    @Override
    public BankAtmDto getBankAtmDtoById(int id) {
        return new BankAtmDto(bankAtmRepository.findById(id).orElseThrow());
    }

    @Override
    public List<BankAtmDto> getAllBankAtmsByBankId(int bankId) {
        List<BankAtmDto> res = new ArrayList<>();
        List<BankAtm> response = bankAtmRepository.findAllByBankId(bankId);
        for (BankAtm i : response) {
            res.add(new BankAtmDto(i));
        }
        return res;
    }

    @Override
    public List<BankAtmDto> getAllBankAtms() {
        List<BankAtmDto> res = new ArrayList<>();
        List<BankAtm> response = bankAtmRepository.findAll();
        for (BankAtm i : response) {
            res.add(new BankAtmDto(i));
        }
        return res;
    }
}
