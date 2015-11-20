
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
                setOne = setOne.substring(1);
                setTwo = setTwo.substring(1);
        }
//        
//        // create a variable to determine if it is true that the dashes are in the same positions
//        boolean dashesCorrect = true;
//        
//        String changedWordOne = setOne;
//        
//        String changedWordTwo = setTwo;
//        
//        while(dashesCorrect && !changedWordOne.equals("") && !changedWordTwo.equals("")){
//            
//            if(changedWordOne.startsWith("-") || changedWordTwo.startsWith("-")){
//                
//                if(changedWordOne.startsWith("-") && changedWordTwo.startsWith("-")){
//                    
//                    dashesCorrect = true;
//                    
//                    changedWordOne = changedWordOne.substring(1);
//                    changedWordTwo = changedWordTwo.substring(1);
//                    
//                } else{
//                    dashesCorrect = false;
//                }
//            } else{
//                
//                dashesCorrect = true;
//                
//                changedWordOne = changedWordOne.substring(1);
//                changedWordTwo = changedWordTwo.substring(1);
//            }
//        }
        return dashesCorrect;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first set of letters / digits: ");
        String setOne = input.nextLine();
        System.out.print("Enter the second set of letters / digits: ");
        String setTwo = input.nextLine();
        
        boolean dashesProper = sameDashes(setOne, setTwo);
        
        if(dashesProper){
            System.out.println("The dashes (-) are in the same spots");
        } else{
            System.out.println("The dashes (-) are not in the same spots");
        }
        
        input.close();
    }
}
