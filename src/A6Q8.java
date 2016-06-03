/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q8 {

    public static String seasons(int month, int day) {
        // start season is winter
        String season = "winter";

        if (month < 4) { //if month is less then 4, season is winter

            season = "winter";

        } else if (month == 3) { //if month is 3 and date is less then 16, season is winter

            if (day < 16) {

                season = "winter";

            } else { 

                season = "spring"; // else its spring

            }

        } else if (month > 3 && month < 6) { //if month is greater then 3 but less then 6, season is spring

            season = "spring";

        } else if (month == 6) { //if month is 6 and date is less then 16, season is spring

            if (day < 16) {

                season = "spring";

            } else {

                season = "summer"; //else its summer
            }

        } else if (month > 6 && month < 9) { // if month is greater then 6 but less then 9, season is summer

            season = "summer";

        } else if (month == 9) { //if month is 9 and date is less then 16, season is summer

            if (day < 16) {

                season = "summer";

            } else {

                season = "fall"; // else its fall
            }

        } else if (month > 9 && month < 12) { //if month is greater then 9 but less then 12, season is fall

            season = "fall";

        } else if (month == 12) { //if month is 12 and date is less then 16, season is fall

            if (day < 16) {

                season = "fall";
                
            } else {
                
                season = "winter"; //else its winter
            }
        }
        // return the season
        return season;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ask the user for the month
        System.out.println("Please enter the month");
        int month = input.nextInt();
        // ask the user for the date
        System.out.println("Please enter the day of the month");
        int day = input.nextInt();
        // variable to store the season
        String currentseason = seasons(month, day);
        // tell them what season it is
        System.out.println("The season is " + currentseason);

    }
}
