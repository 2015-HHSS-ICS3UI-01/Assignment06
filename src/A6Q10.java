
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

    public static void sameDashes(String dash1, String dash2) {
        StringBuilder sBuilder = new StringBuilder(dash1);
        for (int i = 0; i < sBuilder.length(); i++) {
            if (sBuilder.charAt(i) == '-' && dash2.charAt(i) == '-') {
                sBuilder.delete(0, i);
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
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
        int userInput = input.nextInt();
        // Ask user to input second string
        System.out.println("Please place your second input!");
        // Save user's second input to variable 'string2'
        int string2 = input.nextInt();
        // Connect the whole method together with user's input
        sameDashes(userInput, string2);

    }
}
