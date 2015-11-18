
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generates scanner
        Scanner in = new Scanner(System.in);
        // Asks human for a digit to find its first digit
        System.out.println("Please enter a number to find its first digit ");
        int number = in.nextInt();
        // Executes the method at same time saves the answer once firstDigit method is done
        int answer = firstDigit(number);
        // Prints out the answer
        System.out.println("The first digit is " + answer);

    }
    // the method that does a certain function
    public static int firstDigit(int number) {
        // An initial formula to start the while loop
        int calculate = number / 10;
        // if the number is a negative, it neutralizes to a positive
        if(calculate < 1){
            calculate= (calculate*-1);
        // A while loops that keeps calculating until it reaches first digit
        }while (calculate > 10 ) {
            calculate = calculate / 10;
            }
        // returns answer
        return calculate;
    }
}
