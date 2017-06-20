package uhd.Students;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class StudentFactory {  //sf class
    
    public static Student[] createStudents(String filename)   
    {
        int numLines = 0, index = 0;
        BufferedReader iStream;
        String in = "", delims = "[|]+";
        Student[] list = null;
        String[] tokens;
        try {
            iStream = new BufferedReader(new FileReader(filename)); //open file
            while (iStream.readLine() !=null)   
            {
                numLines++;
            } //end while
            iStream.close();
            list = new Student[numLines];
            iStream = new BufferedReader(new FileReader(filename));
           
            while((in = iStream.readLine()) != null)      //read in 
            {
                tokens = in.split(delims);
                if ("U".equals(tokens[0]))   //check tokens for interrupts
                {
                    list[index] = new UndergradStudent(tokens[1], tokens[2], tokens[3], tokens[4], Double.parseDouble(tokens[5])); 
                } //end if
                else if ("G".equals(tokens[0]))  
                {
                    list[index] = new GradStudent(tokens[1], tokens[2], tokens[3], tokens[4]);
                } //end else
                
                index++;
            } //end try
           
            iStream.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File "+ filename +" was not found");
            System.out.println("or could not be opened.");
        }
        catch (IOException e) 
        {
            System.out.println("Error reading from " + filename);
        }
        
        return list;
    }
    
}
