/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class ExamGrade {

    /**
     * @param args the command line arguments
     */
    public static void grade(int grade) {



// output grade based on grade percentage
        if (grade > 80) {
            System.out.println("A");

        } else if (grade >= 70 && grade <= 79) {
            System.out.println("B");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("C");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("D");
        } else if (grade > 50) {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        //input new scanner
        Scanner input = new Scanner(System.in);
        //ask user to enter their grade percentage
        System.out.println("Please enter your grade percentage");
        //store variable in an integer
        int mark = input.nextInt();
        grade(mark);
        //close scanner
        input.close();



    }
}
