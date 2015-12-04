
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        //Asks user to enter a month
        System.out.println("please enter a month in numbers (1-12)");
        //Integer for month
        int month = input.nextInt();
        //Asks user to enter a day of the month
        System.out.println("please enter the day of the month in numbers (1-31)");
        //Integer for the day of month
        int day = input.nextInt();
        //Find the season that corresponds with the entered date
        String season = season(month, day);
        //Outputs what season it is for entered date
        System.out.println("The season for the entered date is " + season);
    }

    public static String season(int month, int day) {
        String season = "";
        //If the month is equal to 3 and the day is less than 16 or the month is equal to or less than 2 the season is Winter
        if (month == 3 && day < 16 || month <= 2) {
            season = "Winter";
            //If the month is equal to 12 and the day is greater than 15 the season is Winter
        } else if (month == 12 && day > 15) {
            season = "Winter";
            //If the month is equal to 3 and the day is greater than 15 or the month is greater than 3 and the month is less than 6 the season is Spring
        } else if (month == 3 && day > 15 || month > 3 && month < 6) {
            season = "Spring";
            //If the month is equal to 6 and the day is less than 16 the season is Spring
        } else if (month == 6 && day < 16) {
            season = "Spring";
            //If the month is equal to 6 and the day is equal to or greater than 16 or the month is greater than 6 and less than 9 the season is Summer
        } else if (month == 6 && day >= 16 || month > 6 && month < 9) {
            season = "Summer";
            //If the month is equal to 9 and the day is less than or equal to 15 the season is Summer
        } else if (month == 9 && day <= 15) {
            season = "Summer";
            //If the month is equal to 9 and the day is equal to or less than 16 or the month is greater than 9 and less than 12 the season is Fall
        } else if (month == 9 && day <= 16 || month > 9 && month < 12) {
            season = "Fall";
            //If the month is equal to 12 and the day is less than  or equal to 15 the season is Fall
        } else if (month == 12 && day <= 15) {
            season = "Fall";
        }
        //Returns the season
        return season;
    }
}
