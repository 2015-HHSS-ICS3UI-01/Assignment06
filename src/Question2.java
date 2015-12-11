
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question2 {

    //create function method to determine letter grade based on grade
    public static void examGrade(int grade){
        /*determine which bracket the grade fits into by comparing grade to brackets
        then output appropriate letter grade*/
        if(grade >= 80){
            System.out.println("You got an A.");
        }else if(grade >= 70){
            System.out.println("You got a B.");
        }else if(grade >= 60){
            System.out.println("You got a C.");
        }else if(grade >= 50){
            System.out.println("You got a D.");
        }else if(grade < 50){
            System.out.println("You got an F.");
        }
        
    }

    public static void main(String[] args) {
        //loop so you can input manty grades
        while(true){
        //create scanner
        Scanner input = new Scanner(System.in);
        //get exam grade from user
        System.out.println("Enter Exam Grade: ");
        //assign grade inputed to integer 'grade'
        int grade = input.nextInt();
        //call on method to perform calculation
        examGrade(grade);
        }
        
    }
}
