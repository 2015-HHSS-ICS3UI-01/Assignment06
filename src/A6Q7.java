
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q7 {

    public static void firstDigit(int num) {

        while (num < -9) {
            num = num * -1;
            num = num / 10;
        }
        while (num > 9) {
            num = num / 10;
        }
        while (num >= -9 && num < 0) {
            num = num * -1;
        }
        System.out.println(num);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        firstDigit(-850);

    }
}