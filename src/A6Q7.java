
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A6Q7 {
    //make procedure to find the first digit

    public static void firstDigit(int number) {
        //make loop to get the first number
        while (number >= 10) {
            int first = number / 10;
            if (first < 10) {
                //print out the first number
                System.out.println("The first number is " + first);
                break;
            }
            number = first;
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        //ask user for a number
        System.out.println("Enter a number");
        int number = in.nextInt();
        //run method
        firstDigit(number);
    }
}
