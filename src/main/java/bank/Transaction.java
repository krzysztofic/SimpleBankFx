package bank;

import java.time.LocalDate;

public class Transaction {

    private int number;
    private LocalDate date;
    private OperationsTypes operations;
    private double amount;

    public Transaction(int number, LocalDate date, OperationsTypes operations, double amount) {
        this.number = number;
        this.date = date;
        this.operations = operations;
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
