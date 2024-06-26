package inheritance.bank;

public class SavingAccount extends BankAccount {
  private double interestRate;


public SavingAccount(String number,double balance, double interestRate){
    super(number,balance);
    this.interestRate=interestRate;

}
    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        System.out.println(getBalance());

    }

    public double calculatingInterestRate(){
        double balanceWithoutInterest=getBalance();
        double interest=balanceWithoutInterest*(interestRate / 100);
        return balanceWithoutInterest + interest;
    }
}
