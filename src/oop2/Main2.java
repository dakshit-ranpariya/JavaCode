package oop2;

public class Main2 {
    public static void main(String[] args){
        Account ac1 = new Account(1001, "Dakshit", 1500);
        Account ac2 = new Account(1002, "Yash", 1000);
        Account.interestRate = 4.75F;
        ac1.calculateInterest();
        ac1.displayAccountDetails();


    }
}

class Account{
    private int accountNumber;
    private String custName;
    private float balance;
    public static float interestRate;

    public Account(int accountNumber, String custName, float balance) {
        this.accountNumber = accountNumber;
        this.custName = custName;
        this.balance = balance;
    }

    public void calculateInterest(){
        System.out.println(accountNumber + " " + custName + " " + interestRate + " " + balance);
        float interest;
        interest = balance * interestRate / 100;
        System.out.println("Interest is: " + interest);
        balance = balance + interest;

    }

    public void displayAccountDetails(){
        System.out.println(accountNumber + " " + custName + " " + balance);
    }
}