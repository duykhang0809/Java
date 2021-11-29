package oop.exercise1;

import util.Validator;

public class Menu {

    SavingAccount account = yourAccount();

    void action() {

        int selection;
        while (true) {

            do {
                menuView();
                System.out.println("Enter your choice:");
                selection = Validator.inputTypeInt();
                switch (selection) {

                    //Create new account
                    case 1: {
                        createNewAccount(account);
                        int confirm = Validator.inputTypeInt();
                        while (true) {
                            switch (confirm) {
                                case 1:
                                    account = yourAccount();
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        }
                        break;
                    }

                    //Check balance
                    case 2: {
                        System.out.println("Your current balance is " + account.getBalance());
                        break;
                    }

                    //Check interested
                    case 3: {
                        System.out.println("Your current interested: " + account.interestAmount());
                        break;
                    }

                    //Deposit balance
                    case 4: {
                        {
                            inputDeposit(account);
                            break;
                        }
                    }

                    //Withdrawal balance
                    case 5: {
                        {
                            inputWithdrawal(account);
                            break;
                        }
                    }
                }
            } while (selection != 6);
            break;
        }
    }

    SavingAccount yourAccount() {
        System.out.println("CREATE NEW ACCOUNT");

        System.out.println("Enter your title:");
        String title = Validator.inputTypeString();

        System.out.println("Enter your balance:");
        long balance = Validator.inputTypeLong();

        System.out.println("Enter your interest rate (%):");
        float interestRate = Validator.inputTypeFloat();

        SavingAccount account = new SavingAccount(title, balance, interestRate);

        return account;
    }

    void menuView(){
        System.out.println("----------Menu----------");
        System.out.println("1.Create new account");
        System.out.println("2.Check your balance");
        System.out.println("3.Check your interested");
        System.out.println("4.Deposit your balance");
        System.out.println("5.Withdraw your balance");
        System.out.println("6.Exit");
        System.out.println("------------------------");

    }

    void createNewAccount(SavingAccount account) {

        System.out.println("Your current account is:");
        System.out.println(account.toString());
        System.out.println("Are you sure to create new account ? ");
        System.out.println("1.OK");
        System.out.println("2.Cancel");
    }

    void inputDeposit(SavingAccount account) {
        System.out.println("Enter the amount you want to deposit: ");
        long amount = Validator.inputTypeLong();
        if (isValidDepositAmount(amount) == true) {
            account.deposit(amount);
            System.out.println("Deposit success !");
            System.out.println("Your current balance is " + account.getBalance());
        } else {
            System.out.println("Deposit fail!");
            System.out.println("The amount must greater than 0");
        }
    }

    void inputWithdrawal(SavingAccount account) {
        System.out.println("Enter the amount you want to withdrawal: ");
        long amount = Validator.inputTypeLong();
        if (isValidWithdrawalAmount(account.getBalance(), amount) == true) {
            account.withdrawal(amount);
            System.out.println("Withdrawal success !");
            System.out.println("Your current balance is " + account.getBalance());
        } else {
            System.out.println("Withdrawal fail!");
            System.out.println("The amount must greater than 0 and smaller than your balance");
        }
    }

    boolean isValidDepositAmount(long amount) {
        if (amount < 0) return false;
        return true;
    }

    boolean isValidWithdrawalAmount(long balance, long amount) {
        if (amount < 0 || amount > balance) return false;
        return true;
    }


}
