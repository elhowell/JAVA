/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author almagueri2
 */
public class Account {
    private double balance;
    private long accountNum;
    
    public Account(){
        //java initializes everything to 0 by default
        balance = 0.0;
        accountNum = 0;
    }
    
    public Account (double balance, long actNum){
        this.balance = balance;
        this.accountNum = actNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNum() {
        return this.accountNum;
    }
    
    public void Deposit(double dAmount){
        balance += dAmount;
    }
    public boolean Withdraw(double wAmount){
        //return true/false        
        if(wAmount > balance)
            return false;
        else balance -= wAmount;
            return true;
            
    }
}
