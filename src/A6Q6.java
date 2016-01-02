/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q6 {
    //function type method that returns the last digit of a number
    public static int lastDigit(int number){
        //create a variable for the last digit
        int last = number;
        //find the last digit of a positive number
        if(number >= 0)
            last = number % 10;
        //find the last digit of a negative number
        if(number < 0) 
            last = number % 10 * -1;
        
        return last;
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the method & print it to the screen
        System.out.println(lastDigit(-7894));
    } 
}
