
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q3 {

    public static void factors(int num) {

        StringBuilder ans = new StringBuilder("");

        int A = num;

        if (A > 0) {
            for (int i = 1; i <= num; i++) {
                int B = A / i;
                int C = B * i;
                if (C == A) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = -1; i >= num; i--) {
                int B = A / i;
                int C = B * i;
                if (C == A) {
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        factors(60);
    }
}
