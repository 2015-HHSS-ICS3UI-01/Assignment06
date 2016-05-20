
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q6 {

    public static void lastDigit(int num) {

        StringBuilder ans = new StringBuilder("");

        int q = num;
        int r = 0;

        r = q % 10;

        if (q < 0) {

            q = q * -1;

            r = q % 10;
        }

        System.out.println(r);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        lastDigit(-18);
    }
}
