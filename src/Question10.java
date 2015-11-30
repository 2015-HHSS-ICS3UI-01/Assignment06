
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question10 {
    
    // create a method to check if the dashes of one string of characters are in the same position as another string of characters
    public static boolean sameDashes(String stringOne, String stringTwo) {
                
        // create a variable to determine if it is true that the dashes are in the same positions
        boolean dashesPositionsMatch = true;
        
        // to determine if dashes in each string match positions, use a technique to compare the 
        // the first position of each string for dashes and if there are, determine if match 
        // while we have a "match" of dash positions, remove the first character from each string and repeat.
        // continue to repeat until we don't have a match or we have reached the end of 
        // one of the strings
        while(dashesPositionsMatch && stringOne.length() > 0 && stringTwo.length() > 0){
            
            // if either of the strings start with a dash, then in order to match
            // we need to check that both strings start with a dash otherwise dash positions don't match
            if(stringOne.startsWith("-") || stringTwo.startsWith("-")){
                
                // if the first string and second string starts with a dash then the dashes are in the same spots so far
                if(stringOne.startsWith("-") && stringTwo.startsWith("-")){
                    dashesPositionsMatch = true;
                    
                // if both strings of characters does not start with dashes then the dashes are not in the same positions  
                } else{
                    dashesPositionsMatch = false;
                }
            
            // if neither starts with dashes then the dashes are still true
            } else{
                
                dashesPositionsMatch = true;
            }
            
            // once it the character has been checked move on to the next character
            // cut down each string by removing the first character and repeat
            stringOne = stringOne.substring(1);
            stringTwo = stringTwo.substring(1);
        }

        // If dashes positions match so far then check to see if we are at the end of both strings
        // if we are not at the end of both strings then only one of the strings
        // contains remaining characters, ensure that string doesn't contain any dashes in the remaining
        // string.  If it does contain remaining strings then the dash positions of the string don't match
        if (dashesPositionsMatch && (stringOne.length() > 0 || stringTwo.length() > 0 )) {
            // determine the string that has remaining characters and continue to examine for dashes
            String stringRemaining;
            if ( stringOne.length() > 0 ) {
                stringRemaining = stringOne;
            } else {
                stringRemaining = stringTwo;
            }
            
            // determine if remaining string has dashes, if it does then the dashes in each string don't match
            while (dashesPositionsMatch && stringRemaining.length() > 0){
                // if remaining string contains dashes then then dashes don't match
                if(stringRemaining.startsWith("-")) {
                    dashesPositionsMatch = false;
                
                // else, contine examining characters in the string by removing first character and repeating
                } else {
                    stringRemaining = stringRemaining.substring(1);
                }
            }
        }
 
        // return if the dashes are in the correct places
        return dashesPositionsMatch;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will examin to strings of characters and make sure the dashes are in the same locations
        // do this within a method

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("To determine if two strings characters have '-' in the same positions enter the following information.");
        
        // ask the user to enter the fisrt string of characters and store this in a variable
        System.out.print("Enter the first string of letters / digits: ");
        String stringOne = input.nextLine();
        
        // ask the user to enter the second string of characters adn store this in a variable
        System.out.print("Enter the second string of letters / digits: ");
        String stringTwo = input.nextLine();
        
        // store the outcome of the method sameDashes in a variable
        boolean dashesProper = sameDashes(stringOne, stringTwo);
        
        // if the dashes are in the same location print this
        if(dashesProper){
            System.out.println("The dashes (-) are in the same spots");
            
        // if the dashes are not int eh same location print this
        } else{
            System.out.println("The dashes (-) are not in the same spots");
        }
        
        // close the scanner
        input.close();
    }
}
