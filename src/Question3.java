
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
public class Question3 {
    // create method to find the factors of a number when given the number the person whishes to factor
    public static void factors(int factorNumber) {
        
        // create a loop to check the possible factors of a number from 1 to the number
        for(int possibleFactor = 1; possibleFactor <= factorNumber; possibleFactor = possibleFactor + 1){
            
            // if the number divided by the possible factor has no remainder then it is a factor and then display this
            // if it's not the last factor paste a comma after the factor
            if((factorNumber % possibleFactor) == 0 && possibleFactor < factorNumber){    
                System.out.print(possibleFactor + ", ");
            
            // same conditions as above except if it is the last factor than don't paste a comma after
            } else if((factorNumber % possibleFactor) == 0 && possibleFactor == factorNumber){
                System.out.println(possibleFactor);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will use a method to find all of the factors of a number

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what number they want to find the factors of and store the data on the next line
        System.out.print("Enter the number you wish to find the factors of: ");
        int factorNumber = input.nextInt();
        
        // display what the factors are
        System.out.print("The factors of " + factorNumber + " are ");
        factors(factorNumber);
        
        // close scanner
        input.close();
    }

}
