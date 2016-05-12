
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q3 {

    public static String factors(int n) {
        int x = 2;                                                  //cant divide by 0, 1 will always work, divisor starts at 2
        String ans = "The factors are " + n;                        //begins factors statement
        while (n >= (x)) {                                          //while the divisor is less then number
            int rem = n % x;                                        //finds remainder of number 
            if (rem == 0) {                                         //if remainder is 0
                int y = (n / x);                                    //Variable for recieving factors
                ans = ans + ", " + y;                               //Adds factors to statement
            }
            x = x + 1;                                              //Next divisor
        }
        return ans;                                                 //Returns answer
    }
    
    public static void main(String[] args) {
        System.out.println("Input a number");                       //Asks print number
        Scanner input = new Scanner(System.in);                      //Create Scanner
        int n = input.nextInt();                                     //Recieves number
        System.out.println(factors(n));                              //Prints factors
    }
}
