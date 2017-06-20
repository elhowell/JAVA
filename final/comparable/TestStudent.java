package comparable;
import java.util.ArrayList;
import java.util.Collections;
public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        Student s = new Student("Alice", 3.5);
        studentsList.add(s);
        s = new Student("John", 2.35);
        studentsList.add(s);
        s = new Student("Peter", 3.1);
        studentsList.add(s);
        Collections.sort(studentsList);
        for(Student ss: studentsList)
            System.out.println("Name: " + ss.getName() + " , GPA: " + ss.getGpa());  } }
