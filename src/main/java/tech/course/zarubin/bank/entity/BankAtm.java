package tech.course.zarubin.bank.entity;

import jakarta.persistence.*;
import lombok.*;
import tech.course.zarubin.bank.enums.BankAtmStatus;

@Entity
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bank_atms")
public class BankAtm {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private boolean cashWithdrawal;

    @Column(nullable = false)
    private boolean cashDeposit;

    @Column(nullable = false)
    private double atmMoney;

    @Column(nullable = false)
    private double maintenanceCost;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BankAtmStatus status;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private BankOffice location;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Bank bank;

    public BankAtm(String name, String address, Bank bank, BankOffice location, Employee employee, boolean cashWithdrawal, boolean cashDeposit, double maintenanceCost) {
        this.name = name;
        this.address = address;
        this.bank = bank;
        this.location = location;
        this.employee = employee;
        this.cashWithdrawal = cashWithdrawal;
        this.cashDeposit = cashDeposit;
        this.maintenanceCost = maintenanceCost;
    }
}