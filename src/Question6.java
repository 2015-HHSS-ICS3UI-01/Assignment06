
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question6 {
    //method created to find the last digit of a number

    public static void lastDigit(int number) {
        //get the last digit
        int lastdigit = number % 10;
        //if negative convert to positive
        if (number < 0) {
            lastdigit = lastdigit * -1;
        }
        //output it
        System.out.println("The last digit of " + number + " is " + lastdigit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input a number and insert it into the method
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        //insert number into the method
        lastDigit(number);

    }
}
