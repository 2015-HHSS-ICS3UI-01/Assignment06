/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q3 {

    public static void factors(int number) {
        for (int i = 1; i < number; i++) {
            int num = number;
            // starts off at zero
            int r = 0;
            // remainder
            r = num % i;
            // 
            num = num / i;

            // output dividing numbers
            if (r == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factors(10);
    }
}
