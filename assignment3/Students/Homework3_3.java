package uhd.Students;
public class Homework3_3 {
    public static void main(String[] args){
    StudentFactory trial = new StudentFactory();
    Student[] list = StudentFactory.createStudents("\\Students.txt");  //Filepath may be set to relative or abs.
            for (int i = 0; i < list.length; i++)   {
            System.out.println(list[i].toString());
        }}
}
