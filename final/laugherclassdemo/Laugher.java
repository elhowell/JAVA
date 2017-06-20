package uselaugher;

/**
 *
 * @author marianky
 * CS 3300 
 */
public class Laugher {
    
    /*Data Members/Instance variables
     * Represent the memory of the object
    */
    String defaultLaugh;
    int nLaughs;
    
    /*No-arguments constructor*/
    public Laugher(){}
    
    /*Parametrized constructor, used to intialize
     * instance variables
    */
    public Laugher (String dLaugh, int nL){
        defaultLaugh = dLaugh;
        nLaughs = nL;
    }
    
    public void Laugh(){
        for(int i = 0; i < nLaughs ; i++)
            System.out.println(defaultLaugh);
    }
}
