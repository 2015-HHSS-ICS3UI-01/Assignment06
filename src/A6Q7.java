/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q7 {

    public static int firstDigit(int number) {
        while (number == number) {
            if (number < 0) {
                number = number * -1;
            }
            if (number <= 9) {
                break;
            }
            number = number / 10;
        }
        System.out.println(number);
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        firstDigit(-892345);
    }
}
