package tech.course.zarubin.bank.entity;

import java.util.Random;

public class Bank {
    private final long id;
    private String name;
    private int totalOffice = 0;    //autoupdate
    private int totalAtm = 0;       //autoupdate
    private int totalEmployee = 0;  //autoupdate
    private int totalClient = 0;    //autoupdate
    private int rating;
    private long totalMoneySupply;
    private double interestRate;

    public Bank(long id, String name) {
        Random random = new Random();
        this.id = id;
        this.name = name;
        this.rating = random.nextInt(101);
        this.totalMoneySupply = random.nextInt(10_000, 1_000_001);
        this.interestRate = 731. / rating + random.nextDouble(3.);
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

    public int getTotalOffice() {
        return totalOffice;
    }

    public void setTotalOffice(int totalOffice) {
        this.totalOffice = totalOffice;
    }

    public int getTotalAtm() {
        return totalAtm;
    }

    public void setTotalAtm(int totalAtm) {
        this.totalAtm = totalAtm;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public int getTotalClient() {
        return totalClient;
    }

    public void setTotalClient(int totalClient) {
        this.totalClient = totalClient;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getTotalMoneySupply() {
        return totalMoneySupply;
    }

    public void setTotalMoneySupply(long totalMoneySupply) {
        this.totalMoneySupply = totalMoneySupply;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
