
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q2 {

    public static void examGrade(int grade) {
        if (grade < 50 && grade >= 0) {
            System.out.println("F");
        }
        if (grade >= 50 && grade <= 59) {
            System.out.println("D");
        }
        if (grade >= 60 && grade <= 69) {
            System.out.println("C");
        }
        if (grade >= 70 && grade <= 79) {
            System.out.println("B");
        }
        if (grade > 80) {
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your exam grade:");

        int percentage = input.nextInt();

        examGrade(percentage);
    }
}