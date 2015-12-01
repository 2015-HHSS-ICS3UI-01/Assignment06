
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
            while(number>9){
            number = number/10;
            }
            
            System.out.println(" The first digit of your specific number is " + number);
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please put the number that the first digit is originally from");
        int number = input.nextInt();
        firstDigit(number);
    }
}
