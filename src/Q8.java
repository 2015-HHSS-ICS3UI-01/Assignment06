
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inport new scanner
        Scanner in = new Scanner(System.in);

        //ask user for the current month
        System.out.println("Please enter the current month");

        //next input is the int month
        int month = in.nextInt();

        //ask user for the current day
        System.out.println("Please enter the current day");

        //next input is the int day
        int day = in.nextInt();

        //run the season method
        String currentSeason = season(month, day);

        //output the current season
        System.out.println("The current season is " + currentSeason);

    }

    public static String season(int month, int day) {

        String season = "Winter"; //set the default season to winter

        if (month < 3) { //if the month is less than 3 the season Winter
            season = "winter";
        } else if (month == 3) { //if the month is less than 4
            if (day < 16) { //if the day is less than 16
                season = "Winter"; //make season = winter
            } else {
                season = "Spring"; //make season = spring
            }
        } else if (month < 6) { //if the month is less than 6 the season is Spring
            season = "Spring";
        } else if (month == 6) { //if the month is less than 7
            if (day < 16) { //if the day is less than 16
                season = "Spring"; //make season = spring
            } else {
                season = "Summer"; //make season = summer
            }
        } else if (month < 9) { //if the month is less than 9 the season is Summer
            season = "Summer";
        } else if (month == 9) { //if the month is less than 10
            if (day < 16) { //if the day is less than 16
                season = "Summer"; //make season = summer
            } else {
                season = "Fall"; //make season = fall
            }
        } else if (month < 12) { //if the month is less than 12 the season is winter
            season = "Fall";
        } else if (month == 12) { //if the month is less than 13
            if (day < 16) { //if the day is less than 16
                season = "Fall"; //make season = fall
            } else {
                season = "Winter"; //make season = winter
            }
        }

        //return with the current value fo season 
        return season;
    }
}
