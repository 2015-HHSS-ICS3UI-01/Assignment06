
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inport a scanner
        Scanner in = new Scanner(System.in);

        //ask user for how many lines wanted
        System.out.println("Please enter the number of lines you wish to print:");

        //next int is the # of lines
        int lineRequest = in.nextInt();

        //run the chaotic method
        chaotic(lineRequest);
    }

    public static void chaotic(int numberOfLines) {

        //set counter to 0
        int lineCounter = 0;

        //make a while loop for the number of lines that are going to be printed
        while (lineCounter < numberOfLines) {
            int random = (int) (Math.random() * (5 - 1 + 1)) + 1; //find a random number
            int asterisksCount = 0; //set the asterisks count to 0
            while (asterisksCount < random) { //until the number of asterisks equals the random number
                System.out.print("*"); //output 1 asterisk
                asterisksCount++; //add one to the asterisk count
            }
            System.out.println(""); //output a space
            lineCounter++; //add one to the line counter

        }

    }
}
