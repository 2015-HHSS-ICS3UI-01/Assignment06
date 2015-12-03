/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        examGrade(73);

    }
    //created a new method called examGrade that will use the cariable "grade"

    public static void examGrade(double grade) {
        //if grade is under 50, then an F will be printed on the screen
        if (grade < 50) {
            System.out.println("F");
        }
        //if grade is over or equal to 50 and under or equal to 59, then a D will be printed on the screen
        if (grade >= 50) {
            if (grade <= 59) {
                System.out.println("D");
            }
        }
        //if grade is over or equal to 60 and under or equal to 69, then a C will be printed on the screen 
        if (grade >= 60) {
            if (grade <= 69) {
                System.out.println("C");
            }
        }
        //if grade is over or equal to 70 and under or equal to 79, then a B will be printed on the screen
        if (grade >= 70) {
            if (grade <= 79) {
                System.out.println("B");
            }
        }
        //if grade is over or equal to 80, then an A will be printed on the screen
        if (grade >= 80) {
            System.out.println("A");
        }


    }
}
