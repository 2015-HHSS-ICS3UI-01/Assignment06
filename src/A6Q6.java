
import java.util.Scanner;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A6Q6 {

    public static void lastDigit (int numBer){
        
        //take the last digit from the number
        int lastDig = numBer%10;
        
        System.out.println("The last digit of your number is " + lastDig);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for the number he wants the last digit from
        System.out.println("Enter the number you want the last digit from.");
        int numBer = input.nextInt();
        
        //run the procedure
        lastDigit(numBer);
    }
}
