
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
    
    public static void factors(int factorNumber) {
        
        for( int possibleFactor = 1; possibleFactor <= factorNumber; possibleFactor = possibleFactor + 1){
            
            if((factorNumber % possibleFactor) == 0 && possibleFactor < factorNumber){    
                System.out.print(possibleFactor + ", ");
            
            } else if(possibleFactor == factorNumber){
                System.out.println(possibleFactor);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number you wish to find the factors of: ");
        int factorNumber = input.nextInt();
        
        System.out.print("The factors of " + factorNumber + " are ");
        factors(factorNumber);
        
        input.close();
    }

}
