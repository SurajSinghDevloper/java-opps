package BankClasses;

public class Main {
    public static void main(String[] args) {
        Account boobsAccount =new Account("S420Ku1999",0.0,"Boobs Petersons","boobs31peter1999@gmail.com","8271932791");

        System.out.println(boobsAccount.getNumber());
        System.out.println(boobsAccount.getCustomerName());
        System.out.println(boobsAccount.getCustomerEmail());
        System.out.println(boobsAccount.getCustomerPhoneNumber());
        System.out.println(boobsAccount.getBalance());

        System.out.println("Your Transaction History /n");

        boobsAccount.Withdrawal(100.0);

        boobsAccount.deposit(50.0);
        boobsAccount.Withdrawal(100.0);

        boobsAccount.deposit(51.0);
        boobsAccount.Withdrawal(50.0);
    }
}
//create a new class for a bank account
//Create fields for the account number ,Balance,customer Name,email and phone number.
//
//Create getter and setter for each field
//create two additional methods
//1. To allow the customer to deposit fund (this should increment the balance field.
//2. To allow the customer to withdrawal fund (this should deduct from the balance field,
//but not allow the withdrawal to complete if there are insufficient fund.
//you will want to create various code in the main class to confirm your code is working.