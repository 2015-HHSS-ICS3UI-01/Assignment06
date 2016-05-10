/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kangh4484
 */
public class A6Q5 {

    public static void chaotic(int num) {
        if (num == 1) {
            //print out * when number is 1
            System.out.println("*");
        } else if (num == 2) {
            //print out ** when number is 2
            System.out.println("**");
        } else if (num == 3) {
            //print out *** when number is 3
            System.out.println("***");
        } else if (num == 4) {
            //print out **** when number is 4
            System.out.println("****");
        } else if (num == 5) {
            //print out ***** when number is 5
            System.out.println("*****");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            //generate random number
            int rannum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //print out * for each number
            chaotic(rannum);
        }
    }
}