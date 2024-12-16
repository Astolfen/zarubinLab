package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.CreditAccount;
import tech.course.zarubin.bank.model.CreditAccountDto;
import tech.course.zarubin.bank.repository.*;
import tech.course.zarubin.bank.service.CreditAccountService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreditAccountServiceImpl implements CreditAccountService {
    private final CreditAccountRepository creditAccountRepository;
    private final UserRepository userRepository;
    private final BankRepository bankRepository;
    private final EmployeeRepository employeeRepository;
    private final PaymentAccountRepository paymentAccountRepository;

    @Override
    public CreditAccountDto createCreditAccount(CreditAccountDto creditAccountDto) {
        creditAccountRepository.save(
                new CreditAccount(
                        userRepository.findById(creditAccountDto.getUserId()).orElseThrow(),
                        bankRepository.findById(creditAccountDto.getBankId()).orElseThrow(),
                        creditAccountDto.getStartDate(),
                        creditAccountDto.getLoanTermMonths(),
                        creditAccountDto.getInterestRate(),
                        employeeRepository.findById(creditAccountDto.getEmployeeId()).orElseThrow(),
                        paymentAccountRepository.findById(creditAccountDto.getPaymentAccountId()).orElseThrow()
                )
        );
        return creditAccountDto;
    }

    @Override
    public void deleteCreditAccount(int id) {
        creditAccountRepository.deleteById(id);
    }

    @Override
    public CreditAccountDto updateCreditAccount(int id, int bankId) {
        var creditAccount = creditAccountRepository.findById(id).orElseThrow();
        creditAccount.setBank(bankRepository.findById(bankId).orElseThrow());

        return new CreditAccountDto(creditAccountRepository.save(creditAccount));
    }

    @Override
    public CreditAccountDto getCreditAccountDtoById(int id) {
        return new CreditAccountDto(creditAccountRepository.findById(id).orElseThrow());
    }

    @Override
    public List<CreditAccountDto> getAllCreditAccounts() {
        List<CreditAccountDto> res = new ArrayList<>();
        List<CreditAccount> response = creditAccountRepository.findAll();
        for (CreditAccount i : response) {
            res.add(new CreditAccountDto(i));
        }
        return res;
    }
}
