
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q3 {

    public static void factorNumbers(int factor) {
        int remainder = factor;
        int m = 1;
        while( m <= remainder){
            if (remainder %m ==0 ) {
                System.out.print(m +", " );
                
                }
            m++;
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a number");
        int number = input.nextInt();
        System.out.print("Factors of "+ number + " are: ");
        factorNumbers(number);
        
    }
}

