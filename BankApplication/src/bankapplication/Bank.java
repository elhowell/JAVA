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
public class Bank {
    private String name;
    private Client client;
    
    public Bank(){
        name = null;
        client = null;
    }
    
    public Bank (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Client getClient() {
        return client;
    }
    public Client CreateClient(String fName, String lName, String add, long pNum, long SSN, Account act){
        //Client c = new Client(fName, lName, add, pNum, SSN, null);
        //Account a = new Account(100, 12345);
        //if account where public, could do c.Account = a;
        //c.setAccount(a);
        
        Client c = new Client (fName, lName, add, pNum, SSN, new Account (100,12345));
        this.client = c;
        return c;
    }
}
