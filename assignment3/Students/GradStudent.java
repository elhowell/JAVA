package uhd.Students;

public class GradStudent extends Student   //gradstudent
{    String researchArea;
        public GradStudent(String n, String i, String m, String r)    
    {
        name = n;
        id = i;
        major = m;
        researchArea = r;
    }
    @Override  //using overrides
    double getGPA()   //get the gpa
    {
        return 4.0;
    }
    @Override  //using override
    public String getString()   //return the formatted String
    {
        return ("G|" + name + "|" + id + "|" + major + "|" + researchArea);
    }}
