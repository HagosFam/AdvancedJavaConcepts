package bank;

import java.util.HashMap;
import java.util.Map;

public class BankApplication {
    private String accountId;
    private int amount;
    private Map<String, Integer> accounts;
    private Map<String, Integer> activityCounter;
    BankApplication(String accountId, int amount) {
        this.accountId = accountId;
        this.amount = amount;
        accounts = new HashMap<>(); // assigning empty value
    }

    // creating account
    public boolean createAccount(String accountId) {
        if (accounts.containsKey(accountId)) {
            return false;
        }
       // activityCounter.computeIfPresent(accountId, 1);
        accounts.put(accountId, 0);
        return true;
    }

    // deposit
    public int deposit(String accountId, int amount) {
        if (!accounts.containsKey(accountId)) {
            return 0;
        }
        int newBalance = accounts.get(accountId) + amount;
        accounts.put(accountId, newBalance);
        return newBalance;
    }

    // transfer
    public int transfer(String from, String to, int amount) {
        // both accounts should exist
        if (!accounts.containsKey(from) || accounts.containsKey(to) || accounts.get(from) < amount) {
            return -1;
        }
        // from's money ( value) should be greater or equal to the amount
        // i should deduct the amount from the from account
        int newSenderBalance = accounts.get(from) - amount;
        accounts.put(accountId, newSenderBalance);
        // i should add the amount to the existing to amaount
        // return
        int receiverBalance = accounts.get(to) + amount;
        accounts.put(to, receiverBalance);
        return receiverBalance;
    }
}
