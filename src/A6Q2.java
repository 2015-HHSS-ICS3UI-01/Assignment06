
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generates scanner
        Scanner in = new Scanner(System.in);
        // Asks for percentage
        System.out.println("Please enter your percentage");
        double grade = in.nextInt();
        // Executes the method
        examGrade(grade);
        
        
        
    }// A side method void type, meaning no answer is returned.
    public static void examGrade(double grade){
        // Spits out their letter grade according to percentage
        if(grade < 50){
            System.out.println("You got a F!");
        }if(grade >= 50 && grade <= 59){
            System.out.println("You got a D!");
        }if(grade >= 60 && grade <=69){
            System.out.println("You got a C!");
        }if(grade>= 70 && grade <= 79){
            System.out.println("You got a B!");
        }if(grade >= 80){
            System.out.println("You got a A!");
        }
      
    }
}
