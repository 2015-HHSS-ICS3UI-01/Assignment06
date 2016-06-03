/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q3 {

    public static void factors(int integer) {

        for (int n = 1; n <= integer; n++) {

            if (integer % n == 0) {

                System.out.println("factors of (" + integer + ")= " + n);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        //ask them for a number
        System.out.println("Please enter a number to be factored:");
        int integer = input.nextInt();
        // return them their factored number
        factors(integer);
    }
}
