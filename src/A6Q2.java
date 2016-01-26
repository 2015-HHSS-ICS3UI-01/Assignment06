/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q2 {

    public static void examGrade(double grade) {
          //give an A grade to students who got over 79
        if (grade >= 80) {
            System.out.println("A");
        } //give a B grade to students who got 70-79
        else if (grade >= 70) {
            System.out.println("B");
        } //give a C grade to students who got 60-69
        else if (grade >= 60) {
            System.out.println("C");
        } //give a D grade to students who got 50-59
        else if (grade >= 50) {
            System.out.println("D");
        } //give an F grade to students who got below 50
        else if (grade >= 0) {
            System.out.println("F");
        } 
     
    }
    
    public static void main(String[] args) {
        //allow the student to input his/her mark to receive a letter grade
        examGrade(89);
    }
}
