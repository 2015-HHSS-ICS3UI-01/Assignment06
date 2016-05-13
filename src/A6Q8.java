/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q8 {

    public static void season(int month, int day) {
        // If month is 1 or 2 then the season is Winter
        if (month == 1 || month == 2) {
            System.out.println("It is Winter.");
            // If month is 3 and the day is less than 16, it is Winter
        } else if (month == 3 && day < 16) {
            System.out.println("It is Winter.");
            // If month is 12 and day is greater than 15, it is Winter
        } else if (month == 12 && day > 15) {
            System.out.println("It is Winter.");
            // If month is 3, it is Spring
        } else if (month == 3) {
            System.out.println("It is Spring.");
            // If month is 12, it is Fall
        } else if (month == 12) {
            System.out.println("It is Fall.");
            // If month is 4 or 5, it is Spring
        } else if (month == 4 || month == 5) {
            System.out.println("It is Spring.");
            // If month is 6 and day is less than 16, it is Spring
        } else if (month == 6 && day < 16) {
            System.out.println("It is Spring.");
            // If month is 6 and day is more than 15, it is Summer
        } else if (month == 6 && day > 15) {
            System.out.println("It is Summer.");
            // If month is 7 or 8, it is Summer
        } else if (month == 7 || month == 8) {
            System.out.println("It is Summer.");
            // If month is 9 and day is less than 16, it is Summmer
        } else if (month == 9 && day < 16) {
            System.out.println("It is Summer.");
            // If month is 9 and day is greater than 16, it is Fall
        } else {
            System.out.println("It is Fall.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // User's input, month and date (< in this order)
        season(12, 16);
    }
}
