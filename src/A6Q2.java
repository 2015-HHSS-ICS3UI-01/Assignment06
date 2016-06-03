/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q2 {

    public static void examGrade(int mark) {

        //if their mark is less then 50
        if (mark < 50) {
            System.out.println("Your grade is a F");

        }
        // if their mark is higher than 50 but less then 60
        if (mark >= 50 && mark < 60) {
            System.out.println("Your grade is a D");

        }
        // if their mark is higher than 60 but less then 70
        if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is a C");

        }
        // if their mark is greater than 70 but less than 80
        if (mark >= 70 && mark < 80) {

            System.out.println("Your grade is a B");
        }
        // if their mark is greater then 80
        if (mark > 80) {

            System.out.println("Your grade is a A");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Scanner input = new Scanner(System.in);
        //ask the user for their percentage they got on their exam
        System.out.println("What percent did you get on your exam?");
        int mark = input.nextInt();
        examGrade (mark);
    }
}
