
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
    
    public static void examGrade(double examPercentage) {
        
        char gradeLevel;
        
        if(examPercentage  < 50){
            gradeLevel = 'F';
        } else if(examPercentage >= 50 && examPercentage <= 59){
            gradeLevel = 'D';
        } else if(examPercentage >= 60 && examPercentage <= 69){
            gradeLevel = 'C';
        } else if(examPercentage >= 70 && examPercentage <= 79){
            gradeLevel = 'B';
        } else{
            gradeLevel = 'A';
        }
        System.out.println("The level of your exam percentage is " + gradeLevel);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Exam Percentaage: ");
        double examPercentage = input.nextDouble();
        
        examGrade(examPercentage);
        
        input.close();
    }

}
