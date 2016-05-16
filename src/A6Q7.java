/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A6Q7 {

    public static void firstNumber(int num) {       // creating the method 

        if (num < 0) {                              // if the number is less then 0 do the following 
            num = num * -1;                         // int num equals the number x -1
        }

        String number = Integer.toString(num);      // converting the string to a integer 
        String firstNumber = (number.substring(0, 1));  // the string is equal to the substring with values 0 and 1
        System.out.println(firstNumber);            // output the value of the string firstNumber

    }

    public static void main(String[] args) {

        firstNumber(54322);    // where the number is entered that will go through the proccess above 

    }
}
