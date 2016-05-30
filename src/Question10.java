
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question10 {
    //create a method to determine if a string has dashes in all the same places

    public static void sameDashes(String string1, String string2) {
        //boolen start is false
        boolean start = false;
        //create intergers with the length of each string
        int string1length = string1.length();
        int string2length = string2.length();
        //create the leangth of the word that will be searched
        int searchlength = 0;
        //if string 1 is greater than string 2
        if (string1length > string2length) {
            //the search length will be that of the length of the second string
            searchlength = string2length;
            //create a substring where the remainer of string 1 will be searched for dashes and if it has dashes it will be false
            String stringend = string1.substring(searchlength);
            for (int i = 0; i <= (stringend.length() - 1); i++) {
                if (stringend.charAt(i) == '-') {
                    System.out.println("It's not a match");
                    //boolean start is true is theres a dash
                    start = true;
                    break;
                }

            }
        } else if (string1length < string2length) {
            //if string 2 is greather the search length will be the length of string 1
            searchlength = string1length;
            //search the remainder of string 2 and if it has a dashes it will also be false
            String stringend = string2.substring(searchlength);
            for (int i = 0; i <= (stringend.length() - 1); i++) {
                if (stringend.charAt(i) == '-') {
                    System.out.println("It's not a match");
                    //true if dash is found
                    start = true;
                    break;

                }
            }

        }
        //don't do this if a dash is found
        if (!start) {
            //check both words for dashes if there are any that are not matching return false
            int count = 0;
            for (int i = 0; i < searchlength; i++) {
                if (string1.charAt(i) == '-' && string2.charAt(i) == '-' || string1.charAt(i) != '-' && string2.charAt(i) != '-') {
                    count = count + 1;
                }


            }
            //the number of matches of the characters are the saame as the searchlength its a match
            if (count == searchlength) {
                System.out.println("It's a match!");
            } else if (count != searchlength) {
                System.out.println("It's not a match");
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input two strings and input them into the method
        Scanner input = new Scanner(System.in);
        System.out.println("Input your two strings on seperate lines");
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        sameDashes(string1, string2);
    }
}
