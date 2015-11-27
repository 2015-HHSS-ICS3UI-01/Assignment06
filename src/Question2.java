
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question2 {

    public static void examGrade(int percentage){
        String grade;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade as a percentage");
        int percentage = input.nextInt();
        String grade;
        if(percentage < 50){
            grade = "F";
            System.out.println("Your grade is: " + grade);  
        }if(percentage >= 50 && percentage <=59){
            grade = "D";
            System.out.println("Your grade is: " + grade);
        }if(percentage >= 60 && percentage <= 69){
            grade = "C";
            System.out.println("Your grade is: " + grade);
        }if(percentage >= 70 && percentage <= 79){
            grade = "B";
            System.out.println("Your grade is: " + grade);
        }if(percentage >= 80){
            grade = "A";
            System.out.println("Your grade is: " + grade);
        }
    }
}
