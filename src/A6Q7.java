
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A6Q7 {

    public static int firstdigit(int number) {
        //if the number is less than 0 (negative) then mutiply by -1 to make is posotive 
        if (number < 0) {
            number = number * (-1);

        }
        //if number entered if bigger than 10 then divide by 10 untill it is a single digit(less than 10)
        while (number >= 10) {
            number = number / 10;

        }
        //return number value
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user a number 
        System.out.println(" please enter a number ");
        //allow user to enter a number 
        int number = input.nextInt();
        //send answer

        int first = firstdigit(number);
        //tell user the first digit of the number 
        System.out.println("The first digit of the number is " + first);



    }
}
