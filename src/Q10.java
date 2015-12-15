
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inport scanner
        Scanner in = new Scanner(System.in);
        
        //ask user to input 2 numbers
        System.out.println("Please input 2 phrases");
        
        //accept the 2 numbers
        String string1 = in.nextLine();
        String string2 = in.nextLine();
        
        //run the method
        boolean answer = sameDashes(string1, string2);
        
        if(answer == true){ //if the method returned true
            System.out.println("Both strings have dashes in the same spots"); //output they are the same
        }else{ //otherwise
            System.out.println("The strings have dashes in different spots"); //output they are different
        }
    }
    public static boolean sameDashes(String string1, String string2){
        
        int wordLengthA = string1.length(); //length of string1
        
        int wordLengthB = string2.length(); //length of string2
        
        int wordLength = 0;  //create the int for the longest word
        
        if(wordLengthA>wordLengthB){ //if string1 is longer
            wordLength = wordLengthA; //set string 1 as the longest word
        }else{ //otherwise
            wordLength = wordLengthB; //set string 2 as the longest word
        }
        
        int letterCount = 0; //set the letter counter to 0
        
        while(wordLength > letterCount){ //until the lettercounter reaches the word lenght
            int dashA = string1.indexOf("-"); //find the first dash
            
            int dashB = string2.indexOf("-"); //find the first dash
            
            if (dashA != dashB){ //if the dashes are not in the same places
                return false; //return false
            }
            letterCount++; //add one to letter count
            string1 = string1.replaceFirst("-", ""); //replace the first "-" with a ""
            string1 = string2.replaceFirst("-", ""); //replace the first "-" with a ""
        }
        return true; //return true
        
        
    }
}
