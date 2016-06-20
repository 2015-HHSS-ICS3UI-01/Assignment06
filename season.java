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
public class season {

    public static void season(int m) {
        //input new scanner
        Scanner input = new Scanner(System.in);
        // ask user to enter a day between 1 and 31
        System.out.println("Please enter the day between 1 and 31");
        //store variable in an integer
        int day = input.nextInt();
        if (m == 12 & day >= 16 || m == 2 || m == 3 & day <= 15) {
            System.out.println("Winter");

        } else if (m == 3 & day >= 16 || m == 4 || m == 5 & m == 6 & day <= 15) {
            System.out.println("Spring");

        } else if (m == 6 & day >= 16 || m == 7 || m == 8 || m == 9 & day <= 15) {
            System.out.println("Summer");

        } else {
            System.out.println("Fall");
        }
    }

    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        //ask user to enter a month numerically
        System.out.println("Please enter a month between 1 and 12");
        //store variable in an integer
        int m = input.nextInt();
        season(m);
        //close scanner
        input.close();




    }
}
