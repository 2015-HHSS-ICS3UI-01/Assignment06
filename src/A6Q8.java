
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A6Q8 {

    public static String season(int month, int day) {
        //set default season to winter 
        String season = "winter";




        if (month < 4) { //if month is less than 4 season is winter 
            season = "winter";

        } else if (month == 3) { //if month is 3, and the date is lesss than 16 it iss still winter
            if (day < 16) {
                season = "winter";
            } else {
                season = "spring"; //else the season will be spring 
            }
        } else if (month > 3 && month < 6) {//if month if bewtween 3 and 6 the season is spring 
            season = "spring";

        } else if (month == 6) { //if the month is june or 6 , and the day is less than 16 the season is still spring 
            if (day < 16) {
                season = "spring";
            } else {
                season = "summer"; //else the seasin will be summer
            }
        } else if (month > 6 && month < 9) {//if the month is between 6 and 9 it is summer
            season = "summer";
        } else if (month == 9) { //if the month is 9 and the date is less than 16 it is still summer
            if (day < 16) {
                season = "summer";
            } else {
                season = "fall"; //else the season will be fall
            }
        } else if (month > 9 && month < 12) {//if month is more than 9 and less than 12 the season is fall 
            season = "fall";
        } else if (month == 12) { //if the month is 12 and day is less than 16 it is still fall
            if (day < 16) {
                season = "fall";
            } else {
                season = "winter";//else the season will be winter 


            }

        }

        return season;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user what month it is 
        System.out.println("What month is it? ");
        //allow user to enter date
        int month = input.nextInt();
        //ask user what the day of the month is 
        System.out.println("What day of the month is it ?");
        //allow user to enter day of month 
        int day = input.nextInt();
        //send infromation to method 
        String currentseason = season(month, day);
        //tell user what season it is 
        System.out.println("The season is " + currentseason);


    }
}
