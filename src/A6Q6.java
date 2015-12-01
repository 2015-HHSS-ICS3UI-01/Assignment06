
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q6 {
        static public void lastDigit(int number){
            int digit = number%10;
            System.out.println(" The last digit of your specific number is " + digit);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please put the number that the last digit is originally from");
        int number = input.nextInt();
        lastDigit(number);
    }
}
