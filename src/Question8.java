
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question8 {

    public static String season(int month, int day) {
        //Always assume the season starts with winter January = 1, January = Winter
        String season = "Winter";

        //If the month is < '4', the season is winter
        if (month < 4) {
            season = "Winter";

            //If month is equal to '3', but < '16' it is still winter 
        } else if (month == 3) {
            if (day < 16) {
                season = "Winter";
                //Otherwise, the season will be spring  
            } else {
                season = "Spring";
            }
            //If the month is > '3' but < '6' the season is spring 
        } else if (month > 3 && month < 6) {
            season = "Spring";

            //If the month is '6', and day <  '16' the season is spring
        } else if (month == 6) {
            if (day < 16) {
                season = "spring";
                //Otherwise, the season will be summer 
            } else {
                season = "Summer";
            }
            //if the month is > '6' but > '9' it is summer 
        } else if (month > 6 && month < 9) {
            season = "Summer";
            //if the month is equal to '9' and the date is < '16' it is summer
        } else if (month == 9) {
            if (day < 16) {
                season = "Summer";
                //else the season will be Autumn
            } else {
                season = "Autumn";
            }
            //If month is > '9' and < '12' the season is fall
        } else if (month > 9 && month < 12) {
            season = "Autumn";
            //if the month is equal to 12 and day is < 16 it is fall 
        } else if (month == 12) {
            if (day < 16) {
                season = "Autumn";
                //Otherwise the season will be winter
            } else {
                season = "Winter";
            }
        }
        return season;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner to allow the user to input 
        Scanner input = new Scanner(System.in);
        //Ask the user for a month between January and December
        System.out.println("Please input a month (01-12) ");
        //Allow month inut
        int month = input.nextInt();
        //Ask for a dya of the month 
        System.out.println("Please enter the day of the month (1-31) ");
        //Input the day  
        int day = input.nextInt();
        //String to recieve calculations form the method
        String WSSA = season(month, day);
        //Output the season 
        System.out.println("The season is " + WSSA);
    }

}