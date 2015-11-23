
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q6 {

    public static int lastDigit(int last) {
        last = last%10;
        return last;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int last = input.nextInt();
        last = lastDigit(last);
        System.out.println("Last digit is "+last);
    }
}
