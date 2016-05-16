/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q3 {

    public static void factors(int number) {

        for (int i = 1; i < number; i++) {//starts int at 1 and keeps deviding up until it reaches the number
            int q = number;//default int that is being devided
            int r = 0;//an int that will shortcut the remainder
            r = q % i;//find the remainder
            q = q / i;// divide by the number
            if (r == 0) {//if the remainder is zero
                System.out.println(i);//print out the number


            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        factors(100);//input the number that the code will work around
    }
}
