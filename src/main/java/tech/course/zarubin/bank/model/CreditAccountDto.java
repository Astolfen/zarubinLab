package tech.course.zarubin.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.course.zarubin.bank.entity.CreditAccount;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditAccountDto {

    private int userId;
    private int bankId;
    private LocalDate startDate;
    private int loanTermMonths;
    private double loanAmount;
    private double interestRate;
    private int employeeId;
    private int paymentAccountId;

    public CreditAccountDto(CreditAccount creditAccount) {
        this.userId = creditAccount.getUser().getId();
        this.bankId = creditAccount.getBank().getId();
        this.startDate = creditAccount.getStartDate();
        this.loanTermMonths = creditAccount.getLoanTermMonths();
        this.loanAmount = creditAccount.getLoanAmount();
        this.interestRate = creditAccount.getInterestRate();
        this.employeeId = creditAccount.getEmployee().getId();
        this.paymentAccountId = creditAccount.getPaymentAccount().getId();
    }
}
