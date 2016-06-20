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
public class chaotic {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int num) {

        //when num is greater than 0
        while (num > 0) {
            int randN = (int) (Math.random() * 100) + 1;
            if (randN >= 0 && randN <= 19) {
                System.out.println("*");
            } else if (randN >= 20 && randN <= 39) {
                System.out.println("**");
            } else if (randN >= 40 && randN <= 59) {
                System.out.println("***");
            } else if (randN >= 60 && randN <= 79) {
                System.out.println("****");
            }
            if (randN >= 80 && randN <= 100) {
                System.out.println("*****");
            }
            num = num - 1;

        }
    }
    //main method

    public static void main(String[] args) {

        //input scanner
        Scanner input = new Scanner(System.in);

        //ask user to enter a number
        System.out.println("Please enter a number");
        //store variable in an integer
        int num = input.nextInt();
        chaotic(num);
        //close scanner
        input.close();
           
    }
}
