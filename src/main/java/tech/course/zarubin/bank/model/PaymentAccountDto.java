package tech.course.zarubin.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.course.zarubin.bank.entity.PaymentAccount;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentAccountDto {

    private int bankId;
    private int userId;

    public PaymentAccountDto(PaymentAccount paymentAccount) {
        this.bankId = paymentAccount.getBank().getId();
        this.userId = paymentAccount.getUser().getId();
    }
}