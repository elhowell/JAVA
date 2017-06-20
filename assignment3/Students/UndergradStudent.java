package uhd.Students;
public class UndergradStudent extends Student
{
    String minor;
    double gpa;
       public UndergradStudent(String n, String i, String m, String min, double g)   //undergrad student class
    {
        name = n;
        id = i;
        major = m;
        minor = min;
        gpa = g;    }
    
    @Override double getGPA()  // return the gpa
    {
        return gpa;    }
    @Override public String getString()   //return the formatted string
     {
        return ("U|" + name + "|" + id + "|" + major + "|" + minor + "|" + gpa);    }  }
