
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A6Q2 {
    //create procedure method to say what your grade is equal to 
    public static void examGrade(int grade) {
        //if your grade is higher than an 80%
        if(grade >= 80) {
            //then print off an 'A' to the screen
            System.out.println("A");
        } // if your grade is between a 70% to 79%
        else if(grade <= 79 && grade >= 70) {
            //then print a 'B' to the screen
            System.out.println("B");
        } //if your grade is between a 60% to 69%
        else if(grade <= 69 && grade >= 60) {
            //then print a 'C' to the screen
            System.out.println("C");
        } //if your grade is between 50% to 59%
        else if(grade <= 59 && grade >= 50) {
            //then print a 'D' to the screen 
            System.out.println("D");
        } //if your grade is between a 0% to 49%
        else if(grade <= 49) {
            //then your grade is a 'F'
            System.out.println("F");
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //find out what your grade is equal to 
        examGrade(81); 

    }
}

