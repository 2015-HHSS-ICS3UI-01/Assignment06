
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A6Q2 {
    // Method that return's user's grade in a letter( A, B, C, D, or, F), using their input of their grade in a percentage
    public static void examGrade(int mark) {
        // If grade is less than 50%, then user has an F
        if (mark < 50) {
            System.out.println("You have an F.");
        }
        // If grade is 50% or above and equal to or less than 59%, then user has a D
        if (mark >= 50 && mark <= 59) {
            System.out.println("You have a D.");
        }
        // If grade is 60% or above and equal to or less than 69%, then user has a C 
        if (mark >= 60 && mark <= 69) {
            System.out.println("You have a C.");
        }
        // If grade is 70% or above and equal to or less than 79%, then user has a B
        if (mark >= 70 && mark <= 79) {
            System.out.println("You have a B.");
        }
        // If grade is 80% or above, then user has a A
        if (mark >= 80) {
            System.out.println("You have an A.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user what their grade percantage is
        System.out.println("Please insert your exam grade in percentage.");
        // Save user's input to varaible 'mark'
        int examMark = input.nextInt();
        // Connect method to the rest of code with user's input
        examGrade(examMark);
    }
}
