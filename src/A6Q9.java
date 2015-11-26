
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q9 {

    public static void allDigitsOdd(int number) {

        for (int i = 0; i < number; i++) {
            number = number / 10;
            number = number % 10;

            if (number == 1 || number == 3 || number == 5
                    || number == 7 || number == 9) {
                number = 1;
            } else if (number == 0 || number == 2 || number == 4
                    || number == 6 || number == 8) {
                number = 0;
            }
        }
        if (number == 1) {
            System.out.println("TRUE");
        } else if (number == 0) {
            System.out.println("FALSE");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = input.nextInt();

        allDigitsOdd(number);

    }
}
