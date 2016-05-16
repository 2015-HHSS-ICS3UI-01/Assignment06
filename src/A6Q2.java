/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q2 {

    public static void examGrade(int num) {
        String ans = "Not Availible";// default string to use for this method
        if (num < 50 && num >= 0) {// if the num,ber is between 0 and 50
            System.out.println("Your mark is an F");// pring out the mark as an F
        }
        if (num <= 59 && num >= 50) {// if the grade is between 50 and 59
            System.out.println("Your mark is a D");//your mark is an D
        }
        if (num <= 69 && num >= 60) {// if the grade is between 60 and 69
            System.out.println("Your mark is a C");//your mark is an C
        }

        if (num <= 79 && num >= 70) {// if the grade is between 70 and 79
            System.out.println("Your mark is a B");//your mark is an B
        }
        if (num >= 80) {//if the number is over 80
            System.out.println("Your mark is an A");//your mark is an A
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        examGrade(78);//Input Grade number
    }
}
