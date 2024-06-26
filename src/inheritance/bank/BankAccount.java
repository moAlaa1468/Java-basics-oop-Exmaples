package inheritance.bank;

public class BankAccount {
    private String number;
    private double balance;

    public BankAccount(){
    }

    public BankAccount(String number, double balance) {
        this.number = number;
        this.balance = balance;
        System.out.println("The super constructor is invoked !");

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number==""){
            System.out.println("Enter a valid number");
        }
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0){
            System.out.println("Enter a valid number");
        }
        this.balance = balance;
    }

    public double withdraw(double x){
        if(x>balance){
            System.out.println("There is not enough money");
        }
        balance=balance-x;
        return balance;
    }

    public void deposit(double y){
        balance=balance+y;
    }


    public void display(){
        System.out.println("The number of the account is : "+number);
        System.out.println("The balance of the account is : "+balance);

    }


}
