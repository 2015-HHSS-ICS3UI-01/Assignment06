
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q07 {

    public static void firstDigit(int number) {

        if (number >= 1) {
            for (int i = 10; i < number; i++) {
                number = number / 10;
            }
        } else if (number < 1) {
            for (int i = -10; i > number; i--) {
                number = number / 10;
            }
        }
        System.out.println("The first digit is " + number);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = input.nextInt();

        firstDigit(number);
    }
}
