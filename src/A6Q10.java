
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q10 {

    public static void sameDashes(String dashes1, String dashes2) {
        //repeats program
        while (true) {
            //uses firstDash and secondDash
            int firstDash = dashes1.indexOf("-");
            int secondDash = dashes2.indexOf("-");

            //checks if words contain dashes
            if (!dashes1.contains("-") || !dashes2.contains("-")) {
                //prints out false and then breaks
                System.out.println("FALSE");
                break;
            }//checks if the dashes are in the same place
            else if (firstDash == secondDash && firstDash >= 0) {
                dashes1 = dashes1.substring(firstDash + 1);
                dashes2 = dashes2.substring(secondDash + 1);
            }//prints out true if they are
            else if (firstDash == -1 && secondDash == -1) {
                System.out.println("TRUE");
                break;
            }//prints out false if they are not
            else {
                System.out.println("FALSE");
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //user enters words with dashes
        System.out.print("Please enter a word: ");
        String dashes1 = input.next();
        System.out.print(" Please enter another word: ");
        String dashes2 = input.next();

        //goes to same dashes method
        sameDashes(dashes1, dashes2);
    }
}