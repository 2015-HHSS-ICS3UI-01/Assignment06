
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q9 {

    public static void odd(int num) {
        //change number into string
        String number = Integer.toString(num);
        boolean allOdd = true;
        //check number from begining
        for (int i = 0; i < number.length(); i++) {
            char n = number.charAt(i);
            //check whether number is odd or even
            if (n == '1' || n == '3' || n == '5' || n == '7' || n == '9') {
            } else {
                allOdd = false;

            }
        }
        //print out ture if all numbers are odd
        if (allOdd == true) {
            System.out.println("True");
        } else {
            //print out false if there is even number
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask for number
            System.out.println("Please input number");
            int num = input.nextInt();
            //bring the method above
            odd(num);
        }
    }
}
