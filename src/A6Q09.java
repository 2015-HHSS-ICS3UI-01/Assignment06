
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q09 {

    public static void allDigitsOdd(int number) {

        //repeats loop untiol no more numbers
        while (number % 2 == 1) {
            //takes off the last number and then repeats
            number = number / 10;
        }
        //number is true if equals 0
        if (number / 2 == 0) {
            System.out.println("TRUE");
        }//number is false if doesn't equal 0 
        else if (number / 2 != 0) {
            System.out.println("FALSE");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);
        //asks user to type a number
        System.out.print("Type in a number: ");
        int number = input.nextInt();
        //reuturns number typed to allDigitsOdd method
        allDigitsOdd(number);

    }
}
