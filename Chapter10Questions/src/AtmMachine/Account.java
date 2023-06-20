package AtmMachine;

import java.util.Date;
/**
 *
 * @author BurakSaltali
 *
 */
public class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;

    private Date dateCreated = new Date();

    public Account(){}
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest(){
        double monthlyInterestRate = (getAnnualInterestRate()/1200);
        return (this.balance*monthlyInterestRate);
    }
    public void withdraw(double withdrawAmount){
        if (balance-withdrawAmount>=0)
            this.balance -= withdrawAmount;
        else
            System.out.println("Your account balance is insufficient");
    }
    public void deposit(double withdrawAmount){
        this.balance += withdrawAmount;
    }
}
