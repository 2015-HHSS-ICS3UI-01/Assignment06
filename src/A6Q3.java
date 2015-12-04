
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A6Q3 {
    
    public static void factors (int factor) {
      
        //check if the number factors into the factor
       for(int countDown = 1; countDown < factor; countDown++){
        int check = (factor%countDown);
        
        //check for remainder
        if(check == 0){
            System.out.println("A number that would factor into  " + factor + " is " + countDown);
        }
        
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make the scanner
        Scanner input = new Scanner(System.in);
        
        //Ask for the factor
        System.out.println("Please input the number you would like to factor for.");
        int factor = input.nextInt();
        
        //run procedure
        factors(factor);
        
        
    }
}
