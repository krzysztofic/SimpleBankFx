package bank;


public class Account {

    private int number;
    private double balance;
    private Owner owner;
    private double depositInterestRate;

    public Account(int number, double balance, Owner owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public Account(int number, String fistName, String lastName, Address address, String PESEL) {
        this.number = number;
        this.owner = new Owner(fistName, lastName, address, PESEL);
    }

      public void add(double amount){
        if(amount > 0 ){
            balance += amount;
        }
    }

    public void payOff(double amount) throws AccountsException {
        if(balance - amount < 0 ){
            throw new AccountsException("You don't have enough money");
        }else if(balance ==0 ){
            throw new AccountsException("You account is empty");
        }else {
            balance -= amount;
        }
    }

    private double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public double getDepositInterestRate() {
        return depositInterestRate;
    }

    public void setDepositInterestRate(double depositInterestRate) {
        this.depositInterestRate = depositInterestRate;
    }
}
