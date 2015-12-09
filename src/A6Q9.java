
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A6Q9 {
//Make procedure
    public static void DigitsOdd(int number) {
        //put the last digit in integer
        int last = number % 10;
        //make loop to find if every number is odd
        while (last % 2 == 1) {
            number = number / 10; 
        last = number % 10;
        }
//output whether it is true or false
if (number <= 10) {
                System.out.println("True");
            }else{ 
    System.out.println("False");
}


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        //ask for a number
        System.out.println("Enter a number");
        int number = in.nextInt();
        //run method
        DigitsOdd(number);
    }
}
