/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q8 {

    public static void seasons(int month, int day) {
        //create code that can detect a season with only the date given.
        if (month == 1) {
            System.out.println("Winter");
        }
        if (month == 2) {
            System.out.println("Winter");
        }
        if (month == 3 && day <= 15) {
            System.out.println("winter");
        }
        if (month == 3 && day >= 16) {
            System.out.println("Spring");
        }
        if (month == 5) {
            System.out.println("Spring");
        }
        if (month == 6 && day <= 15) {
            System.out.println("Spring");
        }
        if (month == 6 && day >= 16) {
            System.out.println("Summer");
        }
        if (month == 7) {
            System.out.println("Summer");
        }
        if (month == 8) {
            System.out.println("Summer");
        }
        if (month == 9 && day <= 15) {
            System.out.println("Summer");
        }
        if (month == 9 && day >= 16) {
            System.out.println("Fall");
        }
        if (month == 10) {
            System.out.println("Fall");
        }
        if (month == 11) {
            System.out.println("Fall");
        }
        if (month == 12 && day <= 15) {
            System.out.println("Fall");
        }
        if (month == 12 && day >= 16) {
            System.out.println("Winter");
        }
    }

    public static void main(String[] args) {
        seasons(10, 16);
    }
}
