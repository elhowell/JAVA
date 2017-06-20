package serilaizationtest;
import java.io.*;
public class SerilaizationTest {
    public static void main(String[] args) {
        Employee e = new Employee("John Smith", "Houston, TX", 11221122, 1);
        SerializeEmployee(e);
        Employee loadedEmp = null;
        DeserializeEmployee(loadedEmp);
        Employee[] empArr = new Employee[3];
        empArr[0] = e;
        e = new Employee("Alice", "Sugar Land, TX", 22332233, 2);
        empArr[1] = e;
        e = new Employee("Peter", "Cypress, TX", 44554455, 3);
        empArr[2] = e;
        SerializeEmployeeArray(empArr);
        Employee[] toLoadEmpArr = null;
        DeserializeEmployeeArray(toLoadEmpArr);
    }
    
    public static void SerializeEmployee(Employee e) {
        try {
            FileOutputStream fileOut =  new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    
    public static void DeserializeEmployee(Employee toLoadEmp) {
        try {
            //1- Create InputFileStream object and set it to the serilazed file
            FileInputStream fileIn = new FileInputStream("employee.ser");
            //2- Create an ObjectInputStream object
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //3- Read from the input stream and load in an Employee object
            // Note you need to downcast from Object to Employee since readObject returns
            // an Object
            toLoadEmp = (Employee) in.readObject();
            //4- Close all your resources
            in.close();
            fileIn.close();
        } catch (IOException i) {
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            return;
        }
        System.out.println("Deserialized Employee...");
        //Note that the SSN was not loaded, since it wasn't serialized in the first placae!
        System.out.println(toLoadEmp.toString());        
    }
    
    public static void SerializeEmployeeArray(Employee[] empArr) {
        try {
            //1- Create a file object from FileOutputStream class to write the object in 
            // The convention in java serializable objects is to create a file with ".ser" extension
            FileOutputStream fileOut =
                    new FileOutputStream("employeesArray.ser");
            //2- Create an ObjectOutputStream object
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //3- Write your object using the WriteObject method
            out.writeObject(empArr);
            //4-5 Close all your resources (ObjectOutputStream and FileOutputStream)
            out.close();
            fileOut.close();
            System.out.println("Serialized Array is saved in employeesArray.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    
    public static void DeserializeEmployeeArray(Employee[] toLoadEmpArr) {
        try {
            //1- Create InputFileStream object and set it to the serilazed file
            FileInputStream fileIn = new FileInputStream("employeesArray.ser");
            //2- Create an ObjectInputStream object
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //3- Read from the input stream and load in an Employee object
            
            // Note this time we are downcasting to an Array of Employee type
            toLoadEmpArr = (Employee[])in.readObject();
            //4- Close all your resources
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employees Array Contents ...");
        for(Employee e : toLoadEmpArr )
            System.out.println(e.toString());        
    }
}
