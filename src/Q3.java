
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
        for (int i = 1; i <= f; i++) {
            int remainder = f % i;

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
        int f = input.nextInt();
        System.out.println("Factored numbers of " + f + " is ");
        factors(f);
        

    }
}
