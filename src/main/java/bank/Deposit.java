package bank;

import java.time.LocalDate;

public class Deposit {

    private double intereset;
    private LocalDate creationDate, closingDate ;
    private double depositAmount;

    public Deposit(double intereset, LocalDate creationDate, LocalDate closingDate, double depositAmount) {
        this.intereset = intereset;
        this.creationDate = creationDate;
        this.closingDate = closingDate;
        this.depositAmount = depositAmount;
    }

    public void checkDeposits(){
        //TODO : add method
    }
}
