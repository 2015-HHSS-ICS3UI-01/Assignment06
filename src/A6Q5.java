/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q5 {

    public static void chaotic(int lines) {
        for (int linesSpaced = 0; lines > linesSpaced; linesSpaced = linesSpaced + 1) {

            //
            int RandNumber = (int) (Math.random() * (5)) + 1;
            for (int asteriks = 0; RandNumber > asteriks; asteriks = asteriks + 1) {

                System.out.println("*");

            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        chaotic(6);

    }
}
