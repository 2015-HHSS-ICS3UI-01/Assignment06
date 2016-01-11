
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner 
        Scanner in = new Scanner(System.in);

        // Values of the greatest and lowest amount of Asterisks in a line  
        int upperLimit = 5;
        int lowerLimit = 1;

        // Output our sentence to the user letting them know what they entered
        System.out.println("How many lines do you want? ");
        int parameter = in.nextInt();

        // Execute Method 
        chaotic(parameter);
    }

    // Method Using Chaotic 
    public static void chaotic(int lines) {

        // To generate a number of symbols in between two numbers  
        for (int i = 0; i < lines; i++) {
            int randNum = (int) (Math.random() * (5)) + 1;

            // Making the number of symbols on each line random  
            for (int symbol = randNum; symbol >= 1; symbol--) {
                System.out.print("*");
            }
            // Allowing the loop to continue
            System.out.println("");
        }

    }
}
