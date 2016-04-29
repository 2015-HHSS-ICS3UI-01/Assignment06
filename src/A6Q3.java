
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A6Q3 {

    public static double factors(int divider) {
        double ans = (divider / 2);
        return ans;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Ask the user to input their number they wish to find the factos to
        System.out.println("Please input the number you wish to find its factors.");
        // Save the user's input 
        int factors = input.nextInt();

        int divider = input.nextInt();
        System.out.println("The factors to " + divider);
        double ans = factors(factors);
    }
}
