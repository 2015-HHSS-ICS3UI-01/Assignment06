
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

    public static void examGrade(int mark) {
        // Grade percentages punched it and then program recongizes which letter grade
        if (mark < 50) {
            System.out.println("You have an F.");
        }
        if (mark >= 50 && mark <= 59) {
            System.out.println("You have a D.");
        }
        if (mark >= 60 && mark <= 69) {
            System.out.println("You have a C.");
        }
        if (mark >= 70 && mark <= 79) {
            System.out.println("You have a B.");
        }
        if (mark >= 80) {
            System.out.println("You have an A.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Save the user's input
        Scanner input = new Scanner(System.in);
        // Ask the user what their grade percantage is
        System.out.println("Please insert your exam grade in percentage.");
        int mark = input.nextInt();
        // Place the answer back onto screen
        examGrade(mark);
    }
}
