
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q7 {

    public static int firstDigit(int n) {
        if (n < 0) {                                                            //removes negatives
            n = n * -1;
        }
        while (n > 9) {                                                         //removes digits until the first one
            n = n / 10;
        }

        return n;                                                               //returns number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input a number to get the first digit");            //Asks to input number
        int n = input.nextInt();                                                //recieves number
        System.out.println(firstDigit(n));                                      //prints answer
    }
}
