package student;

/**The java program TestStudent creates 25 student
* objects and generate random value for mid1 , mid2 and
* final score and print the grade letters to the console.*/
//TestStudent.java
import java.util.Random;

public class TestStudent
{
   public static void main(String[] args)
   {
      
       //set size to 25
       final int SIZE=25;
       //create an array of 25 students.
       Student[] students=new Student[SIZE];
      
       // createStudents
       createStudents(students);
       // printStudentsgrades
       printStudentsgrades(students);      
   }
   /**The method printStudentsgrades takes
   * the array as input variable to print*/
   private static void printStudentsgrades(Student[] students) {
       System.out.printf("%-20s%-10s%-10s%-10s%-5s\n",
               "Name ","Midterm1 ","Midterm2 ","Score ","Grade");
              
       for (int i = 0; i < students.length; i++)
       {
           System.out.printf("%-20s%-10.2f%-10.2f%-10.2f%-5c\n",
                   students[i].getName(),
                   students[i].getMidterm1(),
                   students[i].getMidterm2(),
                   students[i].getFinalScore(),
                   students[i].calculateGrade());
       }
   }

   /**The method createStudents that takes students array as input argument
   * and create an object of student and set 
   * */
   private static void createStudents(Student[] students)
   {
       Random rand=new Random();
      
       for (int i = 0; i < students.length; i++)
       {
           students[i]=new Student();
           students[i].setMidterm1(rand.nextInt((100 - 50) + 1) + 50);
           students[i].setMidterm2(rand.nextInt((100 - 50) + 1) + 50);
           students[i].setFinalScore(rand.nextInt((100 - 50) + 1) + 50);
       }
      
   }
}