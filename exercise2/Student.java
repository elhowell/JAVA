package student;

/**
 *
 * @author Evan Howell
 */
/**The java class Student that represents a student object.
* The class has constructor to set default vales.
* Prints the midterms and final score.
* CalculateGrade returns the letter grade*/
//Student.java
public class Student
{
     //private variables of class
   private String name;
   private int id;
   private double midterm1;
   private double midterm2;
   private double finalScore;
   //static variable nextid
   private static int nextid=1;
     //Set default vlaues
   
   public Student()
   {              
       name="Student"+nextid;
       id=nextid;
       nextid++;  
       midterm1=0;
       midterm2=0;
       finalScore=0;
   }
  
    //Returns name
   public String getName()
   {
       return name;
   }
  
   //Set midterm1 score
   public void setMidterm1(double midterm1)
   {
       this.midterm1=midterm1;
   }
  
   //Set Midterm2 score
   public void setMidterm2(double midterm2)
   {
       this.midterm2=midterm2;
   }
  
   //final score
   public void setFinalScore(double finalScore)
   {
       this.finalScore=finalScore;
   }
  
   //Returns Midterm1 score
   public double getMidterm1()
   {
       return midterm1;
   }
  
   //Returns Midterm2 score
   public double getMidterm2()
   {
       return midterm2;
   }
  
   //Returns final score
   public double getFinalScore()
   {
       return finalScore;
   }
  
   //caclualte the letter
   public char calculateGrade()
   {
       char grade=' ';
       //calculate total score
       double tScore=getMidterm1()*0.3+getMidterm2()*0.3+getFinalScore()*0.4;
      
       if(tScore>90)
           grade='A';
       else if(tScore>=80 && tScore<90)
           grade='B';
       else if(tScore>=70 && tScore<80)
           grade='C';
       else if(tScore>=60 && tScore<70)
           grade='D';
       else
           grade='F';      
       //final letter grade
       return grade;
   }
  
}