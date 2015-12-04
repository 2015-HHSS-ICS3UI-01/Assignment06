
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //asks user to enter two different strings
        System.out.println("Please enter two different strings.");
        //input for first string
        String s1= input.nextLine();
        //input for second string
        String s2= input.nextLine();
        //runs the method sameDashes with the entered srtrings
        boolean sameDashes=sameDashes( s1, s2);
        //if sameDashes is true it outputs that the dashes are in the same spots
        if (sameDashes){
            System.out.println("The dashes are in the same spots.");
            //if sameDashes is false it outputs that the dashes are not in the same spots
        }else{
            System.out.println("The dashes are not in the same spots.");
        }
    }
    public static boolean sameDashes(String s1, String s2){
        //makes boolean dashes true
        boolean dashes=true;
        //makes an integer for the length of wordA
        int wordA=s1.length();
        //makes an integer for the length of wordB
        int wordB=s2.length();
        //makes integer for the length of a word
        int lengthOfWord=0;
        //if wordA is greater than wordB
        if(wordA>wordB){
            //the length of the word is the length of wordA
            lengthOfWord=wordA;
            //else
        }else{
            //the length of the word is the length of wordB
            lengthOfWord=wordB;
        }
        //makes integer for the number of letter in word
        int numOfLetters=0;
        //while the length of the word is greater than the number of letters
        while(lengthOfWord>numOfLetters){
            //make integer to look for dashes in s1
            int dashS1=s1.indexOf("-");
            //make integer to look for dashes in s2
            int dashS2=s2.indexOf("-");
            //if dashS1 does not equal dashS2 it returns false
            if(dashS1!=dashS2){
                return false;
            }
            //add one to the number of letters each time
            numOfLetters++;
            //Finds the first dashes and takes the value and turns it to nothing to find next dash in first word
            s1=s1.replaceFirst("-", "");
            //Finds the first dashes and takes the value and turns it to nothing to find next dash in second word
            s2=s2.replaceFirst("-", "");
        }
        //returns true
        return true;
    }
}
