package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.PaymentAccount;
import tech.course.zarubin.bank.model.PaymentAccountDto;
import tech.course.zarubin.bank.repository.BankRepository;
import tech.course.zarubin.bank.repository.PaymentAccountRepository;
import tech.course.zarubin.bank.repository.UserRepository;
import tech.course.zarubin.bank.service.PaymentAccountService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentAccountServiceImpl implements PaymentAccountService {
    private final PaymentAccountRepository paymentAccountRepository;
    private final UserRepository userRepository;
    private final BankRepository bankRepository;

    @Override
    public PaymentAccountDto createPaymentAccount(PaymentAccountDto paymentAccountDto) {
        paymentAccountRepository.save(new PaymentAccount(userRepository.findById(paymentAccountDto.getUserId()).orElseThrow(), bankRepository.findById(paymentAccountDto.getBankId()).orElseThrow()));
        return paymentAccountDto;
    }

    @Override
    public void deletePaymentAccount(int id) {
        paymentAccountRepository.deleteById(id);
    }

    @Override
    public PaymentAccountDto updatePaymentAccount(int id, int bankId) {
        var paymentAccount = paymentAccountRepository.findById(id).orElseThrow();
        paymentAccount.setBank(bankRepository.findById(bankId).orElseThrow());

        return new PaymentAccountDto(paymentAccountRepository.save(paymentAccount));
    }

    @Override
    public PaymentAccountDto getPaymentAccountDtoById(int id) {
        return new PaymentAccountDto(paymentAccountRepository.findById(id).orElseThrow());
    }

    @Override
    public List<PaymentAccountDto> getAllPaymentAccounts() {
        List<PaymentAccountDto> res = new ArrayList<>();
        List<PaymentAccount> response = paymentAccountRepository.findAll();
        for (PaymentAccount i : response) {
            res.add(new PaymentAccountDto(i));
        }
        return res;
    }
}
