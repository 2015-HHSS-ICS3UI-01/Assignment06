/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q9 {
    //function type method that returns whether a number has any even numbers
    public static String allDigitsOdd(int number) {
        //loop
        while (number > 0) {
            //check to see if the number is even
            if (number % 2 == 0) {
                return "false";
            }
            //isolate the last digit of the number
            number = number / 10;
        }
        //if all digits are odd return true
        return "true";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the method and print out true or false
        System.out.println(allDigitsOdd(1737));
    }
}
