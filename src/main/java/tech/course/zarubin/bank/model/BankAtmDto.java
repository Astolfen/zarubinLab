package tech.course.zarubin.bank.model;

import lombok.*;
import tech.course.zarubin.bank.entity.BankAtm;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BankAtmDto {

    private String name;
    private String address;
    private int bankId;
    private int locationId;
    private int employeeId;
    private boolean cashWithdrawal;
    private boolean cashDeposit;
    private double maintenanceCost;

    public BankAtmDto(BankAtm bankAtm) {
        this.name = bankAtm.getName();
        this.address = bankAtm.getAddress();
        this.bankId = bankAtm.getBank().getId();
        this.locationId = bankAtm.getLocation().getId();
        this.employeeId = bankAtm.getEmployee().getId();
        this.cashWithdrawal = bankAtm.isCashWithdrawal();
        this.cashDeposit = bankAtm.isCashDeposit();
        this.maintenanceCost = bankAtm.getMaintenanceCost();
    }
}