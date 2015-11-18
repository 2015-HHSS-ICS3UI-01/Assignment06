

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generates scanner
       Scanner in = new Scanner(System.in);
       // Asks for 2 desired strings
        System.out.println("Please enter 2 desired phrases");
        String first = in.nextLine();
        String second = in.nextLine();
        // A boolean type method that executes 
        boolean answer = sameDashes(first, second);
        // Prints out if it's true or false
        System.out.println(answer);

    }
    // the method for finding the dashes
     public static boolean sameDashes(String first, String second) {
         // takes the length of first word, which is really all we need
          int numChars = first.length();
          // A counted loop, starting at 0 and keeps adding each letter it scans
             for ( int count = 0; count < numChars;){
                 
                 // takes the corresponding letter (e.g 2 is a)
                 char first1 = first.charAt(count);
                char second1 = second.charAt(count);
     
                // if the character in string 1 has a dash and string doesn't, return false, vise versa
                 if (second1 != '-' && first1 == '-' || second1 == '-' && first1 != '-') {
                return false; 
             }
                 //adds one to count which goes on to next letter
                count++; 
     }// returns true otherwise
        return true;
    }
}

