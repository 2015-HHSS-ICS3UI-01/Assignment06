
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A6Q10 {

    public static String sameDashes1(String string1) {
        // New sBuilder
        StringBuilder sBuilder = new StringBuilder();
        // For loop going through each character of the user's input
        for (int i = 0; i < string1.length(); i++) {
            // ADD ANOTHER INTEGER!
            if (sBuilder.charAt(i) == '-') {
                // If both dashes are at the same place then the program will print out 'True'
                sBuilder.append("True");
            } else {
                // If not true, then it is automatically false
                sBuilder.append("False");
            }
        }
        // Return the answer back
        return sBuilder.toString();
    }

    public static String sameDashes2(String string2) {
        // New sBuilder
        StringBuilder sBuilder = new StringBuilder();
        // For loop going through each character of the user's input
        for (int i = 0; i < string2.length(); i++) {
            // ADD ANOTHER INTEGER!
            if (sBuilder.charAt(i) == '-') {
                // If both dashes are at the same place then the program will print out 'True'
                sBuilder.append("True");
            } else {
                // If not true, then it is automatically false
                sBuilder.append("False");
            }
        }
        // Return the answer back
        return sBuilder.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user to input
        System.out.println("Please place your input!");
        // Save input of user to variable 'input'
        String userInput = input.nextLine();
        // Ask user to input second string
        System.out.println("Please place your second input!");
        // Save user's second input to variable 'string2'
        String userInput2 = input.nextLine();
        // Compares both answer together for final result
        String sameDashes1 = sameDashes1(userInput);
        String sameDashes2 = sameDashes2(userInput2);
        // Compare first string to second
        if (sameDashes1.equals(sameDashes2)) {
            // If both strings are the same, the program prints 'True'
            System.out.println("True");
        } else {
            // If both strings are not the same, the program print 'False'
            System.out.println("False");
        }
    }
}
