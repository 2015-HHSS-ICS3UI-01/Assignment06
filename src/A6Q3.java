/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q3 {

    
    public static void factors(int num) {
        
        for (int i = 1; i < num; i++) {//starts at 1 and will divide until the number entered is reached
            int q = num;//default int that is being divided
            int r = 0;////an int that will shortcut the remainder
            r = q % i;//find the remainder
            q = q / i;//divide by the number
            if (r == 0){//if the remainder is zero
                System.out.println(i);//print out that number
                
                
            }
        }
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        factors(100);//the number that the code will revlove around
    }
}
