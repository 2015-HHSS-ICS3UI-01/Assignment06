
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanenr
        Scanner input=new Scanner(System.in);
        //Asks for percentage on test
        System.out.println("Please enter the percentage");
        // input for percentage
        double grade = input.nextDouble();
        //Finds letter that matches with percentage that is entered
        String answer = gradeL(grade);
        //Outputs percentage as a letter 
        System.out.println("Your mark as a letter is "+ answer);
    }
    //method to find which grade letter goes with what percentage
    public static String gradeL(double examPercent){
        String gradeL= "A";
        //if percentage is higher than 79 the letter grade is an A
        if (examPercent >79){
            gradeL = "A";
            // if percentage is higher than 69 but lower than 80 the letter grade is a B
        } else if (examPercent > 69&examPercent<80){
        gradeL="B";
        //if percentage is higher than 59 but lower than 70 the letter grade is a C
    }else if (examPercent > 59&examPercent<70){
        gradeL="C";
        //if percentage is higher than49 but lower than 60 the letter grade is a D
    }else if (examPercent > 49&examPercent<60){
        gradeL="D";
        //if percentage is lower than 50 the letter grade is an F
    }else if (examPercent > 50){
            gradeL = "F";  
    }
        //returns value of
    return gradeL;
    }
}
