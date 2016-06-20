/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class factors {

    public static void factors(int num) {
// create a for loop 
        for (int factors = 1; factors <= num; factors = factors + 1) {


//if there are no remainders
            if (num % factors == 0) {
// tell user what the factors are
                System.out.println(factors + ",");
            }
        }
    }
//main method

    public static void main(String[] args) {

        //input scanner
        Scanner input = new Scanner(System.in);
        //tell user to enter a number
        System.out.println("Enter a number");

        //store num in a variable
        int num = input.nextInt();

        factors(num);
// close scanner
        input.close();
    }
}
