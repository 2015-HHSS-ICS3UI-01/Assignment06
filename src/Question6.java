
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("The last digit is " + lastDigit(number));
        input.close();
    }
    public static int lastDigit(int number) {
        int lastNumber = number % 10;
        return lastNumber;
    }
}
