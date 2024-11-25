package tech.course.zarubin.bank.entity;

import tech.course.zarubin.bank.enums.BankAtmStatus;

import java.util.Random;

public class BankAtm {
    private final long id;
    private String name;
    private String address;
    private BankAtmStatus status;
    private Bank bank;
    private BankOffice location;
    private Employee serviceEmployee;
    private boolean issuingMoney;
    private boolean depositMoney;
    private long totalMoneySupply;
    private long costMaintenance;

    public BankAtm(long id, String name, BankAtmStatus status, Bank bank, BankOffice location,
                   Employee serviceEmployee, boolean issuingMoney, boolean depositMoney,
                   long totalMoneySupply, long costMaintenance) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.bank = bank;
        this.location = location;
        this.address = location.getAddress();
        this.serviceEmployee = serviceEmployee;
        this.issuingMoney = issuingMoney;
        this.depositMoney = depositMoney;
        this.totalMoneySupply = totalMoneySupply;
        this.costMaintenance = costMaintenance;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BankAtmStatus getStatus() {
        return status;
    }

    public void setStatus(BankAtmStatus status) {
        this.status = status;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankOffice getLocation() {
        return location;
    }

    public void setLocation(BankOffice location) {
        this.location = location;
    }

    public Employee getServiceEmployee() {
        return serviceEmployee;
    }

    public void setServiceEmployee(Employee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
    }

    public boolean isIssuingMoney() {
        return issuingMoney;
    }

    public void setIssuingMoney(boolean issuingMoney) {
        this.issuingMoney = issuingMoney;
    }

    public boolean isDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(boolean depositMoney) {
        this.depositMoney = depositMoney;
    }

    public long getTotalMoneySupply() {
        return totalMoneySupply;
    }

    public void setTotalMoneySupply(long totalMoneySupply) {
        this.totalMoneySupply = totalMoneySupply;
    }

    public long getCostMaintenance() {
        return costMaintenance;
    }

    public void setCostMaintenance(long costMaintenance) {
        this.costMaintenance = costMaintenance;
    }
}
