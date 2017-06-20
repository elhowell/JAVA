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
public class Client {
    private String firstName, lastName, address;
    private long phoneNumber, SSN;
    private Account account;

    public Client(){
        
    }
    public Client(String fName, String lName, String add, long pNum, long SSN, Account act){
            this.firstName = fName;
            this.lastName = lName;
            this.address = add;
            this.phoneNumber = pNum;
            this.SSN = SSN;
            this.account = act;
    }
  
    public void setAccount(Account a){
        this.account = a;
    }
    
    //Allows user to change address
    public void setAddress(String address) {
        this.address = address;
    }
    
    //Allows user to change phone number
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getSSN() {
        return SSN;
    }

    public Account getAccount() {
        return account;
    }
    
}
