
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question8 {
    
    // create a method to determine the season when given the month and the day
    public static String season(int month, int day) {
        
        // create a variable to store the season
        // there is no season yet
        String seasonType = "no season";
        
        // if the month is a value between 1-12 and the day is between 1-31 then it is a real date
        if(month < 12 && day <= 31 && month <= 1 && day >= 1){
            
            // if the month is less than 12 and less than 3 then it has to be winter
            if(month < 12 && month < 3){
                seasonType = "Winter";
            
            // if the month is equal to 3 then the season is either winter or spring
            } else if(month == 3){
                // if the day is between 1-15 then it is winter
                if(day <= 15){
                    seasonType = "Winter";
                // if the day is between 16-31 then it is spring
                } else{
                    seasonType = "Spring";
                }
            
            // if the month is greater than 3 and less than 6 then it has to be spring
            } else if(month > 3 && month < 6){
                seasonType = "Spring";
            
            // if the month is equal to 6 then the season is either spring or summer
            } else if(month == 6){
                // if the day is between 1-15 then it is spring
                if(day <= 15){
                    seasonType = "Spring";
                // if the day is between 16-31 then it is summer
                } else{
                    seasonType = "Summer";
                }
            
            // if the month is greater than 6 and less than 9 then it has to be summer
            } else if(month > 6 && month < 9){
                seasonType = "Summer";
            
            // if the month is equal to 9 then the season is either summer or fall
            } else if(month == 9){
                // if the day is between 1-15 then it is summer
                if(day <= 15){
                    seasonType = "Summer";
                // if the day is between 16-31 then it is fall
                } else{
                    seasonType = "Fall";
                }
            
            // if the month is greater than 9 and less than 12 then it has to be fall
            } else if(month > 9 && month < 12){
                seasonType = "Fall";
            
            // if the month is equal to 12 then the season is either fall or summer
            } else if(month == 12){
                if(day <= 15){
                    // if the day is between 1-15 then it is fall
                    seasonType = "Fall";
                // if the day is between 16-31 then it is winter
                } else{
                    seasonType = "Winter";
                }
            }
        }
        // return what the season is
        return seasonType;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will determine the season once the user enters the month and day using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("To determine the season enter the following information.");
        
        // ask the user what the month is and store this in a variable
        System.out.print("What month is it? ");
        int month = input.nextInt();
        
        // ask the user what the day is and store this in a variable
        System.out.print("What day is it? ");
        int day = input.nextInt();
        
        // output what the season is
        System.out.println("The season is " + season(month, day));
        
        // close the scanner
        input.close();
    }

}
