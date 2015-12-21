/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q7 {
    //create a function type method that returns the first number
    public static int firstDigit(int number) {
        //loop
        while (number == number) {
            //if number is negative 
            if (number < 0) {
                number = number * -1;
            }
            //break if the number is now a single digit
            if (number <= 9) {
                break;
            }
            //get rid of the last number
            number = number / 10;
        }
        
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the method and print it to the screen
        System.out.println(firstDigit(-92345));
    }
}
