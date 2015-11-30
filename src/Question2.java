
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question2 {
    
    // create method to print out the exam grade of the user based on the percentage given
    public static void examGrade(double examPercentage) {
        
        // create variable for the character of the grade level given
        char gradeLevel;
        
        // if the percentage for the exam is less than 50 than the user will be given a F
        if(examPercentage  < 50){
            gradeLevel = 'F';
        // if the percentage for the exam is greater than or equal to 50 than the user will be given a F
        } else if(examPercentage >= 50 && examPercentage <= 59){
            gradeLevel = 'D';
        // if the percentage for the exam is greater than or equal to 60 than the user will be given a F
        } else if(examPercentage >= 60 && examPercentage <= 69){
            gradeLevel = 'C';
        // if the percentage for the exam is greater than or equal to 70 than the user will be given a F
        } else if(examPercentage >= 70 && examPercentage <= 79){
            gradeLevel = 'B';
        // if the percentage for the exam is greater than or equal to 80 than the user will be given a F
        } else{
            gradeLevel = 'A';
        }
        // print out character of grade level
        System.out.println("The level of your exam percentage is " + gradeLevel);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that uses a method to determine what grade level in characters
        // the user recieves based on the percentage they got on the exam

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what their exam percentage is and store the data of the percentage
        System.out.print("Enter your Exam Percentage to determine the grade level: ");
        double examPercentage = input.nextDouble();
        
        // display output of exam grade variable
        examGrade(examPercentage);
        
        // close scanner
        input.close();
    }

}
