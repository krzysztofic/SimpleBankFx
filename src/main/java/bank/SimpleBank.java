package bank;

import java.util.ArrayList;
import java.util.List;

public class SimpleBank {

    private static SimpleBank instance = null;

    private SimpleBank() {
    }


    public static SimpleBank getInstance() {
        if (instance == null) {
            instance = new SimpleBank();
        }
        return instance;
    }

    List<Transaction> transactions = new ArrayList<>();

    public void add(int number, double amount){

    }

    public void payOff(int number, double amount){

    }



}
