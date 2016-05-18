/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void grade(int num) {
        if (num < 50) {                    // if grade is within range specified by statement, print letter specified
            System.out.println("F");
        }
        if (num > 49 && num < 60) {
            System.out.println("D");
        }
        if (num > 59 && num < 70) {
            System.out.println("C");
        }
        if (num > 69 && num < 80) {
            System.out.println("B");
        }
        if (num > 79) {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        grade(30);  //enter grade
    }
}
