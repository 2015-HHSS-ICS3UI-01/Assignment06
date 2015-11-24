
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question3 {

    public static void factor(int i) {
        for (int e = i; e > 0; e--) {
            //This formula finds the remainder of every number below the inputed number.
            int remainder = i % e;
            //If a number has no remainder, then the division of those numbers are calculated.
            if (remainder == 0) {
                int number = i / e;
                System.out.print(number + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to factor.");
        //The user inputs a number to factor
        int factor = input.nextInt();
        factor(factor);

    }
}
