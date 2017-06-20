package serilaizationtest;
public class Employee implements java.io.Serializable {
    private String name;
    private String address;
    private transient int SSN;   //Marking SSN as transient means it will be excluded from the serialization
    private long ID;
    public Employee(String name, String address, int SSN, long ID) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.ID = ID;    }
    public String toString() {   return "Employee{" + "Name:" + name + ", Address:" + address + ", SSN:" + SSN + ", ID:" + ID + '}';    }
 
    public long getID() {return ID;    }

    public int getSSN() {   return SSN;    }

    public String getAddress() {return address;    }

    public String getName() {  return name;   }
}
