package oop.exercise1;

public class Account implements BankingService {
    protected String title;
    protected long balance;

    public Account(String title, long balance) {
        this.title = title;
        this.balance = balance;
    }

    @Override
    public long getBalance() {
        return balance;
    }

    @Override
    public long deposit(long amount) {
        if (amount < 0) throw new NumberFormatException("Amount must be greater than 0");
        return balance = balance + amount;
    }

    @Override
    public long withdrawal(long amount) {
        if (amount < 0 || amount > balance)
            throw new NumberFormatException("Amount must be greater than 0 and smaller than balance");
        return balance = balance - amount;
    }
}
