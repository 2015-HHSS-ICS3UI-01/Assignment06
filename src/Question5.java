
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        //Ask user to enter the number of lines
        System.out.println("Please enter the number of lines");
        //integer for number of lines
        int numLines = input.nextInt();
        //Preforms chaotic method
        chaotic(numLines);
    }
    //Created method to produce a pattern of a random number of asterisks

    public static void chaotic(int numLines) {
        //Creates integer for lines
        int lines = 0;
        //loop for how many lines of asterisks are entered
        while (lines < numLines) {
            //Generates random number of asterisks for each line
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //Create a integer for the asterisk
            int asterisk = 0;
            //while the value of asterisk is less than randNum it runs loop
            while (asterisk < randNum) {
                //Outputs the asterisks
                System.out.print("*");
                //adds 1 value to the variable 
                asterisk++;
            }
            //Output a blank lines
            System.out.println("");
            //adds 1 value to the variable 
            lines++;
        }

    }
}
