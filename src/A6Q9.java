
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */    
      public static void main(String[] args) {
          
        // New scanner
        Scanner in = new Scanner(System.in);
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a number");
        int number = in.nextInt();
        
        // Execute Method 
        main(number);
    }
    public static void main(int number) {

        // takes the the last integer
        int last = number % 10;

        // makes a loop to find the odd digit 
        while (last % 2 == 1) {
            number = number / 10;
            last = number % 10;
        }

        // Displays wheather the number is true or false 
        if (number <= 10) {
            
            // Output our sentence to the user letting them know what they entered
            System.out.println("True");
        } else {
            
            // Output our sentence to the user letting them know what they entered
            System.out.println("False");
        }
    }
  
}
