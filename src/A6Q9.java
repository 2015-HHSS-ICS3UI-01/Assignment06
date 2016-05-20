
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q9 {

    public static void allDigitsOdd(int num) {

        StringBuilder ans = new StringBuilder(num);

        int q = num;
        int r = 0;

        boolean flag = true;
        while (q > 0) {

            r = q % 10;

            q = q / 10;

            if ((r % 2) == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        allDigitsOdd(1358);
    }
}
