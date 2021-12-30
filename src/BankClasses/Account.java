package BankClasses;

public class Account {
    private String Number;
    private double Balance;
    private String CustomerName;
    private String CustomerEmail;
    private String CustomerPhoneNumber;
    public Account(){
        System.out.println("Empty constructor called ");
    }
    public Account(String Number,double Balance,String CustomerName,String CustomerEmail,String CustomerPhoneNumber){
        System.out.println("Account constructors with parameters called");
        this.Number=Number;
        this.Balance=Balance;
        this.CustomerName=CustomerName;
        this.CustomerEmail=CustomerEmail;
        this.CustomerPhoneNumber=CustomerPhoneNumber;
    }
    

    public void deposit(double depositAmount){    //1st Method
        this.Balance +=depositAmount;
        System.out.println("Deposit of "+depositAmount+ "made. New Balance is "+this.Balance);
    }
    public void  Withdrawal(double WithdrawalAmount){ //2 Method
        if (this.Balance-WithdrawalAmount<0){
            System.out.println("Only"+this.Balance+"Available. Withdrawal not process");
        }else {
            this.Balance-=WithdrawalAmount;
            System.out.println("Withdrawal of "+WithdrawalAmount+"Processed. Remaining balance = "+this.Balance);
        }
    }


    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }
}
