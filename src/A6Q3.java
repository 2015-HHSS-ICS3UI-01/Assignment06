
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

            if (number % 1 == 0) {
                System.out.print("1, ");
            }
            if (number % 2 == 0) {
                System.out.print("2, ");
            }
            if (number % 3 == 0) {
                System.out.print("3, ");
            }
            if (number % 4 == 0) {
                System.out.print("4, ");
            }
            if (number % 5 == 0) {
                System.out.print("5, ");
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = input.nextInt();

        factors(number);

    }
}
