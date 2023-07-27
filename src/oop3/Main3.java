package oop3;

public class Main3 {
    public static void main(String[] args){
        Account ac1 = new Account(1001, "Dakshit", 10000);

        ac1.dispAccountDetails();
        ac1.deposit(1000);
        ac1.dispAccountDetails();
        ac1.withdraw(5000);
        ac1.dispAccountDetails();

    }
}

class Account{
    private int accountNo;
    private String custName;
    private int balance;

    public Account(int accountNo, String custName, int balance) {
        this.accountNo = accountNo;
        this.custName = custName;
        this.balance = balance;
    }

    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposit amount is: " + amount);
    }

    public void dispAccountDetails(){
        System.out.println(accountNo + " " + custName + " " + balance);
    }
}
