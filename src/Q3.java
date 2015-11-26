
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q3 {

    public static void factors(int f) {
       //If number cannot be factored, gets next number to check if factorable
        for (int i = 1; i <= f; i++) {
            int remainder = f % i;

            //If number is factorable, its output here
            if (remainder == 0) {
                System.out.println(i);
            } 
        }

   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Asks + gets number to use method on
        System.out.println("Enter a number to get all available factors");
        int f = input.nextInt();
        //Tells user the result
        System.out.println("Factored numbers of " + f + " is ");
        factors(f);
        

    }
}
