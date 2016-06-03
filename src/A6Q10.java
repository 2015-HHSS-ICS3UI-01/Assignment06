/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q10 {

    public static boolean sameDashes(String string1, String string2) {

        // check length for string 1
        int wordlength1 = string1.length();
        // check length for string 2
        int wordlength2 = string2.length();
        // make a longer variable to store the word and set it to 0
        int longerword = 0;

        // if wordlength1 is greater then wordlength2
        if (wordlength1 > wordlength2) {
            // then longerword will be equal to wordlength1
            longerword = wordlength1;

        } else {
            // else longerword will equal to wordlength2
            longerword = wordlength2;
        }

        // counter to count the letters
        int counter = 0;
        // if word is greater then the counter, repeat
        while (longerword > counter) {
            //find the dashes in string1
            int dashes1 = string1.indexOf("-");
            // find the dashes in string2
            int dashes2 = string2.indexOf("-");
            // if dash 1 does not equal dash 2
            if (dashes1 != dashes2) {
                // return false
                return false;
            }
            // add one to the counter each time
            counter++;
            // Replace the first dash in the first string
            string1 = string1.replaceFirst("-", "");
            // Replace the first dash in the second string
            string2 = string2.replaceFirst("-", "");
        }

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word in string 1");
        String string1 = input.nextLine();
        System.out.println("Please enter another word in string 2");
        String string2 = input.nextLine();
        boolean dashes = sameDashes(string1, string2);

        if (dashes == true) {
            // if dashes are in the right place, true
            System.out.println("Dashes seem to be in the right place");

        } else {
            // else if dashes are not in the right place, false
            System.out.println("Dashes seem to be in the wrong place");
        }
    }
}
