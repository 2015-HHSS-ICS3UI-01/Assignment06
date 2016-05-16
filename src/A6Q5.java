/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q5 {

    public static void chaotic(int inputNum) {
        for (int num = 0; num < inputNum; num = num + 1) { // randNum ouputs 7 times
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1; // including variables 1 to 5
            if (randNum == 1) {
                System.out.println("*");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if (randNum == 5) {
                System.out.println("*****");
            }
        }
    }

        /**
         * @param args the command line arguments
         */
    

    public static void main(String[] args) {
        // TODO code application logic here
        chaotic(7); // output number of lines
    }
}
