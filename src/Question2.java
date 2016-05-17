
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
public class Question2 {

    //Returns the exam grade aka method to obtain exam grade (...to be outpted at the end of the code...)
    public static void examGrade(int percentage) {

        //If the inputed mark is less than 50, output to the screen 'F'
        if (percentage < 50) {
            System.out.println("Your mark is F");

        }
        //If the mark is greater than or equal to 50 and less than 60, output to the screen 'D'
        if (percentage >= 50 && percentage < 60) {
            System.out.println("Your mark is D");

        }
        //If the mark is greater than or equal to 60 and less than 70, output to the screen 'C'
        if (percentage >= 60 && percentage < 70) {
            System.out.println("your mark is C");

        }
        //If the mark is greater than or equal to 70 and less than 80, output to the screen 'B'
        if (percentage >= 70 && percentage < 80) {
            System.out.println("Your mark is B");

        }
        //If the mark is greater than or equal to 80 and less than 100, output to the screen 'A'
        if (percentage >= 80 && percentage <= 100) {
            System.out.println("Your mark is A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creat a new scanner to recieve input
        Scanner input = new Scanner(System.in);
        //Ask for a grade for the exam
        System.out.println("What was the grade you recieved on the test? ");
        int Grade = input.nextInt();
        //Return is then outputed to the screen here 
        examGrade(Grade);

    }

}
