package tech.course.zarubin.bank.entity;

public class BankOffice {
    private final long id;
    private String name;
    private String address;
    private boolean isWork;
    private boolean possiblePlaceAtm;
    private int totalAtm;
    private boolean possibleApplyLoan;
    private boolean issuingMoney;
    private boolean depositMoney;
    private long totalMoneySupply;
    private long costMaintenance;

    public BankOffice(long id, String name, String address, boolean isWork, boolean possiblePlaceAtm,
                      int totalAtm, boolean possibleApplyLoan, boolean issuingMoney, boolean depositMoney,
                      long totalMoneySupply, long costMaintenance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isWork = isWork;
        this.possiblePlaceAtm = possiblePlaceAtm;
        this.totalAtm = totalAtm;
        this.possibleApplyLoan = possibleApplyLoan;
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

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public boolean isPossiblePlaceAtm() {
        return possiblePlaceAtm;
    }

    public void setPossiblePlaceAtm(boolean possiblePlaceAtm) {
        this.possiblePlaceAtm = possiblePlaceAtm;
    }

    public int getTotalAtm() {
        return totalAtm;
    }

    public void setTotalAtm(int totalAtm) {
        this.totalAtm = totalAtm;
    }

    public boolean isPossibleApplyLoan() {
        return possibleApplyLoan;
    }

    public void setPossibleApplyLoan(boolean possibleApplyLoan) {
        this.possibleApplyLoan = possibleApplyLoan;
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
