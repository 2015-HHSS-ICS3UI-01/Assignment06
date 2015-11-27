
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question10 {

    public static String sameDashes(String string1, String string2) {
        int time = 0;
        int time2 = 1;
        //These commmands find the length of the words
        int length = string1.length();
        int length2 = string2.length();
        //This statement finds whether or not there`s a dash or a letter in a certain
        //spot.
        while (time <= length || time <= length2) {
            String sub1 = string1.substring(time, time2);
            String sub2 = string2.substring(time, time2);
            //This command allows the program to move on to the next spot.
            time = time + 1;
            time2 = time2 + 1;
            //If the dashes are not in the same spots, then the computer tells the
            //user false.
            if (sub1.equalsIgnoreCase("-") && !sub2.equalsIgnoreCase("-") || !sub1.equalsIgnoreCase("-") && sub2.equalsIgnoreCase("-")) {
                return "false";
            }

        }
        //If the dashes are in the same spot, then the computer tells the user true.
        if (time > length || time > length2) {
            return "True";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 words that are the same length");
        //The user inputs two words with or without dashes.
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        //The method sameDashes finds whether or not dashes int the first word 
        //are in the same place as the dashes in the second word.
        sameDashes(word1, word2);
    }
}
