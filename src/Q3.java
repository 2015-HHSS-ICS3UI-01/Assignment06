
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
      
    public static void factor(int factoringNumber) {
        
        //make the number being divided 
        int counter = 1;
        while(counter <= factoringNumber){ //while the dividing number is less than or equal to the number
            
            int remainder = factoringNumber % counter; //find the remained of the quotient
            
            if (remainder ==0){ //if the remainder = 0
                System.out.printf(counter + ", "); // output the number
            }
            counter++; //add one to the dividing number
        } 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        //inport scanner
        Scanner in = new Scanner(System.in);
        
        //ask user for a number
        System.out.println("Please enter the number:");
        
        //store the number value
        int Number = in.nextInt();
        
        //run the factor method
        factor(Number);
        
    }  
}
