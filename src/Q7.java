
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q7 {

    public static int firstDigit(int first) {
        while (first > 10) {
            if (first > 10) {

                first = first / 10;
            } else if (first < 10 && first >= 0) {
                break;
            }
        }
        return first;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        first = firstDigit(first);
        System.out.println("The first digit is "+first);
    }
}
