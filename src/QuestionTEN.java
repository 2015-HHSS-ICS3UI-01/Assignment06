
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class QuestionTEN {

    public static boolean sameDashes(String one, String two) {
        //Look at the length of the first word
        int LengthOne = one.length();
        //Look at the length of the second word 
        int LengthTwo = two.length();
        //New variable to store longer word and make it equal to zero
        int LongerWord = 0;

        //if the first word is longer then the second name the longer word LengthOne
        if (LengthOne > LengthTwo) {
            //craete new variable to store and make the inputed word LengthOne
            LongerWord = LengthOne;
        } else {
            //else the seconds word is longer 
            LongerWord = LengthTwo;
        }
        // create a varible that will count the letters 
        int NumberOfLetters = 0;
        //while the word is larger than the amount of letters repeat loop 
        while (LongerWord > NumberOfLetters) {
            //Look for the first dash in word #1
            int DashFirstWord = one.indexOf("-");
            //Look for the first dash in word #2
            int DashSecondWord = two.indexOf("-");
            //Dashes are not in the same spot = False 
            if (DashFirstWord != DashSecondWord) {
                //Return false  
                return false;
            }
            //Add one to the number of letters each time  
            NumberOfLetters++;
            //Replace the first dash with an empty space (First Word)
            one = one.replaceFirst("-", "");
            //Replace the first dash with and empty space (Second Word)  
            two = two.replaceFirst("-", "");
        }
        //Return true
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner to recieve input
        Scanner input = new Scanner(System.in);
        //Ask for a string
        System.out.println("Please enter a word that has at least one dash ");
        //Allow the string to be entered 
        String one = input.nextLine();
        //Ask for a second string
        System.out.println("Please enter another word that has at least one dash ");
        //A;;ow the string to be entered
        String two = input.nextLine();
        //retunrn anserws to the method sameDashes 
        boolean finalanswer = sameDashes(one, two);
        //if answer is ture output that both words have the same amount of dashes in the same placement
        if (finalanswer == true) {
            System.out.println("The words have the same number of dashes in the same location ");
            //Otherwise output that the words do not have the same amount of dashes in different placement
        } else {
            System.out.println("The words do not have the same number of dashes nor are they in the same location ");
        }

    }

}
