/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void num(int num) {
        for (int i = 1; i < num + 1; i++) { //int i, when i is smaller than number inputed, keep adding 1 to i
            if (num % i == 0) {         //if number is divided by another number and has no remainder, printed dividing number
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        num(10);        //enter number
    }
}
