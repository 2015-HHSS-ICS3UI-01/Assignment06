
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A6Q6 {
    //create new method that will cretrun the last digit of a number 

    public static int lastdigit(int number) {
        //if the number is less than 0 (negative) then mutiply by -1 to make is posotive 
        if (number < 0) {
            number = number * (-1);

        }
        number = number % 10;
        return (number);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user to enter number 
        System.out.println("Please enter a number");
        //user enters number,and its sotred in a variable
        int number = input.nextInt();
        //send answer 
        int last = lastdigit(number);
        //tell user the last digit of their number 
        System.out.println("The last digit of the number is " + last);


    }
}
