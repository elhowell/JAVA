package stringtest;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author evan
 */
public class StringTest {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new String("This is a test string.");
        String s2 = new String("This is also a test string.");
        
        
        //Print out the s1.length
        System.out.println(s1.length());
        
        //Print out the char at each position of s1
        for (int i=0; i<s1.length(); i++)
        {
         System.out.println(s1.charAt(i));
        }
    
        //print s1.equals(s2)
        System.out.println(s1.equals(s2));
        
        //Print s1.equalsignorecase(s2)
        System.out.println(s1.equalsIgnoreCase(s2));
        //s1.compareto(s2)
        System.out.println(s1.compareTo(s2));
        //s1.regionMatches
        
        Scanner sc=new Scanner(System.in);   //init scanner
        
        System.out.println("Enter toffset: ");  
        int toffset = sc.nextInt();   // Read in toffset
        System.out.println("Enter offset: ");  
        int offset = sc.nextInt();   // Read in offset
        System.out.println("Enter len: ");  
        int len = sc.nextInt();   // Read in len
        System.out.println(s1.regionMatches(toffset, s2, offset, len));
        
        //Regionmatches with bool
        System.out.println("Ignore case? Enter True or false:");
        boolean ignoreCase = sc.nextBoolean();
        System.out.println(s1.regionMatches(ignoreCase, toffset, s2, offset, len));
        
        
        // output s1.indexOf(c,i. Where c is a character, and i is the index to start.
        System.out.println("Enter a character:");
        char c = sc.next().charAt(0);
        System.out.println(s1.indexOf(c, 3));
        
        // Concat function
        System.out.println(s1.concat(s2));
        //replace function
        
        System.out.println("Enter the character you wish to replace:");
        char r1 = sc.next().charAt(0);
        System.out.println("Enter the new Character");
        char r2 = sc.next().charAt(0);
        System.out.println(s1.replace(r1, r2));
        
        // Uppercase and lowercase fucntion
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        
        
        //Begin Sbuffer
        StringBuffer sbuf1 = new StringBuffer("This is a test string.");
        StringBuffer sbuf2 = new StringBuffer("This is also a test string.");
        
        //Print length
        System.out.println(sbuf1.length());
        //delete start,end
        System.out.println("Enter a starting point for delete: ");
        int start = sc.nextInt();
        System.out.println("Enter a ending point for delete: ");
        int end = sc.nextInt();
        System.out.println(sbuf1.delete(start, end));
        
        //sbuff delete
        System.out.println("Enter an index to delete a character: ");
        int del = sc.nextInt();
        System.out.println(sbuf1.deleteCharAt(del));
        
        //sbuff reverse
        System.out.println(sbuf1.reverse());
       
        //replace function
         System.out.println("Enter a starting point for replace: ");
        int start2 = sc.nextInt();
        System.out.println("Enter an ending point for replace: ");
        int end2 = sc.nextInt();
        System.out.println("Enter the word that will replace: ");
        String word = sc.next();
       System.out.println(sbuf1.replace(start2, end2, "word"));
       
       //To Upper case function
       System.out.println(s1.toUpperCase());
       //To lowercase function
        System.out.println(s1.toLowerCase());
    }
   
}
