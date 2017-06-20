package comparable;
public class Student implements Comparable {
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public int compareTo(Object o) {
        if (((Student) o).gpa < gpa) {
            return 1;
        } else if (((Student) o).gpa > gpa) {
            return -1;
        } else { return 0; }   }
    public double getGpa() {
        return gpa;    }
    public String getName() {
        return name;    }        }
