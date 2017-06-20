/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assig2;

/**
 *
 * @author marianky
 */
public class RCondition implements Runnable {

    private int count = 0;
    private int increment = 1;
    
    public void run() {        
           increment();
           System.out.println(count);
    }
    
    public  void increment(){
        int local = count;
        local += increment;
        count = local;       
    }
}
