/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A6Q9 {

    public static void allDigitsOdd(int number) {       // creating the method that will see if all of the digits are odd

        String num = Integer.toString(number);          // creating the string num and converting it to a integer 

        if (num.contains("0") || num.contains("2") || num.contains("4") || num.contains("6") || num.contains("8")) {    // if the number contains any even numbers, return false to the user 
            System.out.println("False");        // returning false to the user 
        } else {    // if there is no even numbers do the following 

            if (num.contains("1") || num.contains("3") || num.contains("5") || num.contains("7") || num.contains("9")) {    // if the number has any even numbers, return true to the user 
                System.out.println("True");     // return true to the user 
            }

        }

    }

    public static void main(String[] args) {        // main method 

        allDigitsOdd(13579);      // entering the number that will go through the process above 

    }
}
