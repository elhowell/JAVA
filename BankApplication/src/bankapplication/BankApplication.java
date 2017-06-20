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
public class BankApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b = new Bank("Chase");
        b.CreateClient("John", "Smith", "1 Main Houston", 888888888, 8929919, null);
        System.out.println("Client name: " + b.getClient().getFirstName() + b.getClient().getLastName());
        //b.getClient() indicates private Data member
        //b client indicates public data members
        System.out.println("Address: " + b.getClient().getAddress());
        System.out.println("Account #: "+ b.getClient().getAccount().getAccountNum());
        System.out.println("Balance: $"+b.getClient().getAccount().getBalance());
        
        b.getClient().getAccount().Deposit(400);
        System.out.println("Balance: $"+b.getClient().getAccount().getBalance());
        
        boolean succeed = b.getClient().getAccount().Withdraw(600);
        if (!succeed)
            System.out.println("Cannot withdraw -- not enough balance");
        
        System.out.println("Balance: $"+b.getClient().getAccount().getBalance());
        
        //Deletings Client's account
        b.getClient().setAccount(null);
        
                }
    
}
