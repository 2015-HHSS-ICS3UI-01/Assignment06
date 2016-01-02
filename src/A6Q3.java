/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q3 {
    //method that finds all factors of a number

    public static void factors(int number) {
        //create a variable to store 1 larger than the number
        int number2 = 1;
        //while the number entered is larger than or equal to number2
        while (number2 <= number) {
            //find the factors
            //if the number divides evenly print it to the screen
            if (number % number2 == 0) {
                System.out.println(number2);
            }
            //add 1 to the variable number2
            number2++;
            //loop
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //list of all the factors
        factors(20);
    }
}
