
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A6Q8 {

    public static void season(int month, int day) {     // creating the method season

        int yearnum = 0;        // creating the integer for the number of days in the year

        if (month == 1) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 0 + day;
        }
        if (month == 2) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 31 + day;
        }
        if (month == 3) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 60 + day;
        }
        if (month == 4) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 91 + day;
        }
        if (month == 5) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 121 + day;
        }
        if (month == 6) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 152 + day;
        }
        if (month == 7) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 182 + day;
        }
        if (month == 8) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 213 + day;
        }
        if (month == 9) {       // the month is these many days of the year added to the day that is in the main method
            yearnum = 244 + day;
        }
        if (month == 10) {      // the month is these many days of the year added to the day that is in the main method
            yearnum = 274 + day;
        }
        if (month == 11) {      // the month is these many days of the year added to the day that is in the main method
            yearnum = 305 + day;
        }
        if (month == 12) {      // the month is these many days of the year added to the day that is in the main method
            yearnum = 335 + day;
        }

        if (yearnum <= 75) {        // if the day is less then number the season is winter
            System.out.println("Winter.");
        }

        if (yearnum >= 351) {       // if the day is more then number the season is winter
            System.out.println("Winter");
        }

        if (yearnum >= 76 && yearnum <= 167) {          // if the day is inbetween these two numbers the season is spring
            System.out.println("Spring");
        }

        if (yearnum >= 168 && yearnum <= 259) {         // if the day is inbetween these two numbers the season is summer
            System.out.println("Summer");
        }

        if (yearnum >= 260 && yearnum <= 350) {        // if the day is inbetween these two numbers the season is autumn
            System.out.println("Autumn");
        }

    }

    public static void main(String[] args) {        // main method

        Scanner topkek = new Scanner(System.in);    // creating the scanner

        season(10, 27);     // where you enter the month and day 

    }
}
