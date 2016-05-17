
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

    public static String sameDashes(String string1) {
        // New sBuilder
        StringBuilder sBuilder = new StringBuilder();
        // For loop going through each character of the user's input
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == '-') {
                // If both dashes are at the same place then the program will print out 'True'
                sBuilder.append("True.");
            } else {
                // If not true, then it is automatically false (both dashes aren't in the same place)
                sBuilder.append("False.");
            }
        }
        // Return the answer back
        return sBuilder.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user to insert an input
        System.out.println("Please insert your first input!");
        // Save input of user to variable 'userInput'
        String userInput = input.nextLine();
        // Ask user to input second string
        System.out.println("Please insert your second input!");
        // Save user's second input to variable 'unserInput2'
        String userInput2 = input.nextLine();
        // Compare both inputs together for final result, using strings
        String sameDashes1 = sameDashes(userInput);
        String sameDashes2 = sameDashes(userInput2);
        String leftover;
        // Program "disregard" the longer word, acknowlegding when one input is shorter than the other
        if (sameDashes1.length() > sameDashes2.length()) {
            // The leftover of the first input, if longer than the second input, will be 'chopped off', in other words, disregarded
            leftover = sameDashes1.substring(sameDashes2.length());
            sameDashes1 = sameDashes1.substring(0, sameDashes2.length());
        } else {
            // The leftover of the second input, if longer than the first input, will be 'chopped off', in other words, disregarded
            leftover = sameDashes2.substring(sameDashes1.length());
            sameDashes2 = sameDashes2.substring(0, sameDashes1.length());
        }

        // Compare first string to second
        if (sameDashes1.equals(sameDashes2)) {
            // If the leftover length is above 0 and if it contains 'True', then output 'False'
            if (leftover.length() > 0 && leftover.contains("True.")) {
                System.out.println("False.");
            } else {
                // If the leftover length is not above 0 and leftover doesn't contain 'True', then output 'True' (both strings are the same) 
                System.out.println("True.");
            }
        } else {
            // If both strings are not the same, the program will output 'False'
            System.out.println("False.");
        }
    }
}
