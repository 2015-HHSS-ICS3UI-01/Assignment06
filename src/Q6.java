
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make a new scanner
        Scanner in = new Scanner(System.in);

        //ask for the grade
        System.out.println("Please enter the number:");

        //input the grade
        int number = in.nextInt();

        //run the method
        int lastDigit = LastDigit(number);
        
        //output the last digit
        System.out.println("The last digit is " + lastDigit);
    }

    public static int LastDigit(int lastNumber) {
        
        if(lastNumber <0){ //if the number is negative
            int positive = lastNumber*-1; //make the number positive
            return positive % 10; //return with the last number as a positive
        }
        
        //find the last digit
        return lastNumber % 10;
    }
}
