
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner 
        Scanner in = new Scanner(System.in);

        // The user enters the mark that they got on there exam 
        System.out.println("Please enter your Percentage: ");

        // Creating a variable to store the mark they got 
        double mark = in.nextInt();

        // Execute method 
        examMark(mark);
    }

    // Method Using Exam Mark 
    public static void examMark(double mark) {

        // Every if condition gives out a specific letter according to the mark 
        if (mark <= 50) {
            System.out.println("You Got An F");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("You Got An D");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("You Got An C");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("You Got An B");
        } else if (mark >= 80) {
            System.out.println("You got An A");
        }

    }
}
