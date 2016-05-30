
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question2 {
    //create method
    //create a method to output grades

    public static void examGrade(int grade) {
        //< 50       -  F
        if (grade < 50) {
            System.out.println("F");
        }
        //50-59    -  D
        if (grade >= 50 && grade < 60) {
            System.out.println("D");
        }
        //60-69    -  C
        if (grade >= 60 && grade < 70) {
            System.out.println("C");
        }
        //70 - 79  -  B
        if (grade >= 70 && grade < 80) {
            System.out.println("B");
        }
        //80+        -  A
        if (grade >= 80) {
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new scanner
        Scanner input = new Scanner(System.in);
        //get and store grade
        System.out.println("Please input a percentage grade");
        int grade = input.nextInt();
        //input grade to examGrade method
        examGrade(grade);
    }
}
