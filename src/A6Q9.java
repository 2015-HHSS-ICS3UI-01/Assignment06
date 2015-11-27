/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q9 {

    public static String allDigitsOdd(int number) {
        String trueFalse = "tF";
        int digits = number;
        int divide = 10;
        while (digits > 9) {
            if (digits == 0 || digits == 2 || digits == 4 || digits == 6 || digits == 8) {
                trueFalse = "False";
                break;
            }
            digits = number / divide;
            divide = divide * 10;
        }
            if (digits == 0 || digits == 2 || digits == 4 || digits == 6 || digits == 8) {
                trueFalse = "False";
            } else {
                trueFalse = "True";
            }
            System.out.println(trueFalse);
            return trueFalse;
    }

        /**
         * @param args the command line arguments
         */
    

    public static void main(String[] args) {
        //
        allDigitsOdd(1675);
    }
}
