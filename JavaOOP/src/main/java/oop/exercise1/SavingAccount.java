package oop.exercise1;

public class SavingAccount extends Account {

    private float interestedRate;

    public SavingAccount(String title, long balance, float interestedRate) {
        super(title, balance);
        this.interestedRate = interestedRate;
    }

    public double interestAmount() {
        return (interestedRate * balance) / 100;
    }

    @Override
    public String toString() {
        return
                "{ Title= '" + title + '\'' +
                ", Balance= " + balance +
                ", Interested Rate= " + interestedRate +
                '}';
    }
}
