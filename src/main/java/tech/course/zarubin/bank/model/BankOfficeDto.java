package tech.course.zarubin.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.course.zarubin.bank.entity.BankOffice;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankOfficeDto {

    private String name;
    private String address;
    private boolean canPlaceAtm;
    private boolean canIssueLoan;
    private boolean cashWithdrawal;
    private boolean cashDeposit;
    private double rentCost;
    private int bankId;

    public BankOfficeDto(BankOffice bankOffice) {
        this.name = bankOffice.getName();
        this.address = bankOffice.getAddress();
        this.canPlaceAtm = bankOffice.isCanPlaceAtm();
        this.canIssueLoan = bankOffice.isCanIssueLoan();
        this.cashWithdrawal = bankOffice.isCashWithdrawal();
        this.cashDeposit = bankOffice.isCashDeposit();
        this.rentCost = bankOffice.getRentCost();
        this.bankId = bankOffice.getBank().getId();
    }
}