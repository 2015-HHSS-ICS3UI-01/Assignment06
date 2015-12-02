
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q7 {
        static public void firstDigit(int number){
            // how to get the number
            while(number>9){
            number = number/10;
            }
            // what the specific number is 
            System.out.println(" The first digit of your specific number is " + number);
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        // where do you get the number
        System.out.println("Please put the number that the first digit is originally from");
        int number = input.nextInt();
        // formula
        firstDigit(number);
    }
}
