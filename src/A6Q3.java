
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q3 {

    public static void factors(int number) {

        //Goes through all the numbers that is divisable
        for(int i = 1; i < number; i++){
            if (number % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(number);     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new Scanner
        Scanner input = new Scanner(System.in);

        //asks user for number to find factors
        System.out.print("Type in a number: ");
        int number = input.nextInt();
        int numbers = input.nextInt();
        
        //tells user factor of their number
        System.out.print("Factors of " + number + " are: ");
        factors(number);

    }
}
