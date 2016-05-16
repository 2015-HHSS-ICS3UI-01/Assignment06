
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A6Q3 {

    public static String factors(int n) {       // creating the method 
        String ans = "";        // putting the string value to nothing so it can be returned 

        for (int i = 1; i < n; i++) {       // finding the integers of the number 
            int q = n;
            int r = 0;
            r = q % i;      
            q = q / i;
            if (r == 0) {       // if int r is still equal to zero output the integers
                System.out.println("The factors of your number are: " + i);     // emitting the factors
            }
        }
        return ans;     // returning the ans so the method works
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // creating the scanner
        System.out.println("What number would you like to know the factors of?");       //asking what number they want the factors of
        int n = input.nextInt();        // inputting the number they would like to know the factors of
        System.out.println(factors(n));     // where the factors are outputted
    }
}
