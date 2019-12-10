package bank;

import java.util.ArrayList;
import java.util.List;

public class AccountPlus extends Account{

    private List<Deposit> deposits = new ArrayList<>();

    public AccountPlus(int number, double balance, Owner owner) {
        super(number, balance, owner);
        deposits =  new ArrayList<>();
    }

    public void addDeposit(Deposit deposit) {
        deposits.add(deposit);
    }
}
