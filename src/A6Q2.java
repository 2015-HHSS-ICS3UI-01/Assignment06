/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q2 {

    public static void examGrade(int grade) {
        String ans = "Please try again.";
        if (grade < 50) {
            ans = "F";
        }
        if (grade < 60) {
            ans = "D";
        }
        if (grade < 70) {
            ans = "C";
        }
        if (grade < 80) {
            ans = "B";
        }
        if (grade >= 80) {
            ans = "A";
        }
        System.out.println("Grade: " + ans);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        examGrade(81);
    }
}