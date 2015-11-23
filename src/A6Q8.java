/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q8 {
    //method to find the season given the month and day
    public static String season(int month, int day) {
        //create variable weather
        //If the date falls between 12/16 and 3/15 it's winter
        String weather = "season";
        if ((month >= 12 && day >= 16) || (month >= 1 && month <= 2) || (month <= 3 && day <= 15)) {
            weather = "Winter";
        //If the date falls between 3/16 and 6/15 it's spring
        } else if ((month >= 3 && month <= 5 && day >= 16) || (month <= 6 && day <= 15)) {
            weather = "Spring";
        //If the date falls between 6/16 and 9/15 it's summer
        } else if ((month >= 6 && month <= 8 && day >= 16) || (month <= 9 && day <= 15)) {
            weather = "Summer";
        //if the date falls between 9/16 and 12/15 it's fall
        } else if ((month >= 9 && day >= 16) || (month <= 12 && day <= 15)) {
            weather = "Fall";
        }
        //print the season to the screen
        System.out.println(weather);
        return weather;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run method with these variables
        season(2, 17);
    }
}
