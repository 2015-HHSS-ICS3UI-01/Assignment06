
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q2 {

    public static void examGrade(int grade) {

        if (grade < 50) {
            System.out.println("F");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("D");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("C");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("B");
        } else if (grade > 80) {
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter exam grade ");
        int grade = input.nextInt();

        examGrade(grade);
    }
}
