
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q3 {
    
    public static void factors (int n){
    
        //create a for loop to check every number between 1 and the number
        for (int factors = 1; factors <= n; factors = factors + 1){
            
            //if there are no remainders...
            if (n%factors == 0){
                
            //...tell user those factors    
                System.out.print(factors+",");
            }
        
    }}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make a new scanner
        
        Scanner input = new Scanner(System.in);
        
        //tell user to enter a number to find the factors for
        
        System.out.println("Please enter a number.");
        
        //store that number in an int
        
        int n = input.nextInt();
        
        //activate the method to determine the factors
        
        factors (n);
    }
}
