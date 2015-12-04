
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A6Q2 {

    public static void examGrade(int grade) {


//Check what the grade was in order to give the user a letter grade
        if (grade < 50) {
            System.out.println("Your grade is F.");
        }
        
        if (grade >= 50 && grade <60) {
            System.out.println("Your grade is D.");
        }
        
        if (grade >= 60 && grade <70) {
            System.out.println("Your grade is C.");
        }
        
        if (grade >= 70 && grade <80) {
            System.out.println("Your grade is B.");
        }
        
        if (grade >= 80) {
            System.out.println("Your grade is A.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make the scanner
        Scanner input = new Scanner(System.in);
        
        //Ask for the users grade
        System.out.println("Please enter your grade.");
        int grade = input.nextInt();
        
        //Give the exam letter grade
        examGrade(grade);

       
        
    }
}
