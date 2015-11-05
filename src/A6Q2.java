
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

    public static String examGrade(double grade) {
        String mark = "not defined";
        if (grade < 50) {
            mark = "F";
        } else if(grade > 51 && grade < 59) {
            mark = "D";
        } else if(grade > 60 && grade < 69) {
            mark = "C";
        } else if(grade > 70 && grade < 79) {
            mark = "B";
        } else if(grade > 80) {
            mark = "A";
        }
        return mark;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //nput scaner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exam grade: ");
        double grade = input.nextDouble();

        System.out.println("Your mark is equal to a: ");
        System.out.println(examGrade(grade));

    }
}
