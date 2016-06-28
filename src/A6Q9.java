
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q9 {

    public static boolean AllDigitsOdd(int n) {
        boolean ado = true;                                                     //creates boolean
        while (n > 0) {                                                         //while n is greater then 0
            int d = n % 10;                                                     //int d is the last digit of n
            if ((d % 2) > 0) {                                                  //if last digit is odd
                n = n / 10;                                                     //removes first digit
                ado = true;                                                     //all digits are still odd 
            } else {
                n = n / 10;
                ado = false;                                                    //one digit is even
                break;                                                          //breaks while
            }
        }
        return ado;                                                             //returns boolean
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input a number to to check for even digits");       //Asks to input number
        int n = input.nextInt();                                                //recieves number
        System.out.println(AllDigitsOdd(n));                                       //prints answer
    }
}
