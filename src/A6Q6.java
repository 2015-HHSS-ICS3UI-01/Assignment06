
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generates a scanner
        Scanner in = new Scanner(System.in);
        // Asks human for a number to print out last digit
        System.out.println("Enter a number you wish to find the last digit of");
        int number = in.nextInt();
        // Executes it and stores the answer from the method
        int answer = lastDigit(number);
        System.out.println(answer);
    }
    
    // Assistant method used to execute 
    public static int lastDigit(int number){
        // The formula of finding last digit
        int results = number%10;
        // Return answer
          return results;      
                
        
    }
}
