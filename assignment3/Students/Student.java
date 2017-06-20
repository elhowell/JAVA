package uhd.Students;

/**
 *
 * @author elhowell
 */
public abstract class Student {
    String name, id, major;
    abstract double getGPA();
    @Override public String toString()  {
        return getString();
    }
    abstract String getString();
}
