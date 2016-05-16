/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q5 {

    public static void chaotic(int inputNum) {//mrthod for this code

        for (int num = 0; num < inputNum; num = num + 1) {//randNum outputs inputted number
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;//incldes variables 1 - 5
            if (randNum == 1) {//if randNum outputs a 1
                System.out.println("*");//output 1 astrisk
            }
            if (randNum == 2) {//if randNum outputs a 2
                System.out.println("**");//output 2 astrisk
            }
            if (randNum == 3) {//if randNum outputs a 3
                System.out.println("***");//output 3 astrisk
            }
            if (randNum == 4) {//if randNum outputs a 4
                System.out.println("****");//output 4 astrisk
            }
            if (randNum == 5) {//if randNum outputs a 5
                System.out.println("*****");//output 5 astrisk
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        chaotic(7);
    }
}
