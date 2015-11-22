
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
    
    // create a method to check if the dashes of one set of characters are in the same position as another set of characters
    public static boolean sameDashes(String setOne, String setTwo) {
                
        // create a variable to determine if it is true that the dashes are in the same positions
        boolean dashesCorrect = true;
        
        // while in the locations checked, the dashes are the same
        // and while there are still characters in both sets of chaacters
        while(dashesCorrect && setOne.length() > 0 && setTwo.length() > 0){
            
            // if the first set of code starts with a dash and the second set of code starts with a dash
            // then those to characters need to be checked
            if(setOne.startsWith("-") || setTwo.startsWith("-")){
                
                // if the first set and second set starts with a dash then the dashes are in the same spots so far
                if(setOne.startsWith("-") && setTwo.startsWith("-")){
                    dashesCorrect = true;
                    
                // if both sets of characters does not start with dashes then the dashes are not in the same positions  
                } else{
                    dashesCorrect = false;
                }
            
            // if niether starts with dashes then the dashes are still true
            } else{
                
                dashesCorrect = true;
            }
            
            // once it the character has been checked move on to the next character
            // cut down the set of characters down by 1
            setOne = setOne.substring(1);
            setTwo = setTwo.substring(1);
        }
        // return if the dashes are in the correct places
        return dashesCorrect;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will examin to sets of characters and make sure the dashes are in the same locations
        // do this within a method

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user to enter the fisrt set of characters and store this in a variable
        System.out.print("Enter the first set of letters / digits: ");
        String setOne = input.nextLine();
        
        // ask the user to enter the second set of characters adn store this in a variable
        System.out.print("Enter the second set of letters / digits: ");
        String setTwo = input.nextLine();
        
        // store the outcome of the method sameDashes in a variable
        boolean dashesProper = sameDashes(setOne, setTwo);
        
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
