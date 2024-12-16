package tech.course.zarubin.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.course.zarubin.bank.entity.Bank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankDto {

    private String name;

    public BankDto(Bank bank) {
        this.name = bank.getName();
    }
}
