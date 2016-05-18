/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int ast) {
        for (int i = 1; i < ast + 1; i++) { // for int i, i less than or equal to number inputed(lines of asteriks), add 1 to i each time

            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;//// generate random number from 1 - 5
            for (int o = 1; o < randNum + 1; o++) { //for int 0 = 1, o is less than or equal to ranNum, keep adding 1
                System.out.print("*"); //keep adding asteriks until number equals ranNum
            }
            System.out.println(); // adds paragraph after each line of asteriks is created
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        chaotic(10);


    }
}
