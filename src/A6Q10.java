
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner 
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter the First Statement: ");
        String firstWord = in.nextLine();

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter the Second Statement: ");
        String secondWord = in.nextLine();

        // Execute Method 
        boolean result = sameDashes(firstWord, secondWord);
        
        System.out.println(result);
    }
        // Using the Same Dashes Method
    public static boolean sameDashes(String firstWord, String secondWord) {

        // Variable used to find the length of the word 
        int word = firstWord.length();

        // Numbers that represents the pertucular letters in the full word (0,a)(1,b)(2,c)
        for (int letters = 0; letters < word; letters++) {
            char First = firstWord.charAt(letters);
            char Second = secondWord.charAt(letters);

            // Determies if the dashes are in the proper spots 
            if (First == '-' && Second == '-' || First != '-' && Second != '-') {
                
            } else{
             
                return false;
            }
            
        // returns true if the phrases have the same dashes in the right position
        }
        return true; 
        

    }
}
