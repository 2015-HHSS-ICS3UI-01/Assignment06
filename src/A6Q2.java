/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A6Q2 {

    public static String examGrade(int g) { // creating the variable for the exam grade
        String ans = "Not Available";

        if (g <= 49 && g >= 0) {    // if the mark is in between 0 and 49 then the mark is an F
            ans = "F";
        }
        if (g >= 50 && g <= 59) {   // if the mark is in between 50 and 59 then the mark is an D 
            ans = "D";
        }
        if (g >= 60 && g <= 69) {   // if the mark is in between 60 and 69 then the mark is an C 
            ans = "C";
        }
        if (g >= 70 && g <= 79) {   // if the mark is in between 70 and 79 then the mark is an B 
            ans = "B";
        }
        if (g >= 80 && g <= 100) {  // if the mark is in between 80 and 100 then the mark is an A 
            ans = "A";
        }
        if (g < 0 || g > 100) {     // if the mark is less then 0 or more then 100 the mark is invalid
            ans = "not available.";
        }

        System.out.println("Your mark is a " + ans); // emitting the mark

        return ans; // returning the method 
    }

    public static void main(String[] args) {

        examGrade(94); // where you enter the grade you got 

    }
}
