
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
        String seasonType;
          
        
        // Test the month and day parameters to ensure they are in valid ranges before 
        // attempting to determine a season.   Note: not attempting to handle leap year special case
        if (month >=1 && day >=1 && month <= 12 && day <= 31) {
            
            // Assign a season based on the following month/day scheme
            //     If the date falls between 12/16 and 3/15 - return "Winter". 
            //     If the date falls between 3/16 and 6/15, - return "Spring". 
            //     If the date falls between 6/16 and 9/15, - return "Summer". 
            //     If the date falls between 9/16 and 12/15 - return "Fall".
            if ( ( month < 3 ) || ( month == 3 && day <= 15 ) || ( month == 12 && day >= 16 ) ) {
                seasonType = "Winter";
            }
            else if ( ( month < 6 ) || ( month == 6 && day <= 15 ) ) {
                seasonType = "Spring";
            }
            else if ( ( month < 9 ) || ( month == 9 && day <= 15 ) ) {
                seasonType = "Summer";
            }
            else if ( ( month < 12 ) || ( month == 12 && day <= 15 ) ) {
                seasonType = "Fall";
            }
            else {
                seasonType = "Invalid month or day parameter";
            }
        
        // Invalid month or day parameter
        } else {
            seasonType = "Invalid month or day parameter";
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
