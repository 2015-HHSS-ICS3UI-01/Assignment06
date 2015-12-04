
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner
        Scanner input=new Scanner(System.in);
        //Asks user to input number
        System.out.println("Please enter a number that can be divided without a remainder");
        //creates line for user to put selected number
        int number=input.nextInt();
        //runs the factors method with selected number
        factors(number);
    }
    //Created new method to find the factors of a number
    public static void factors (int num){
        //Starting dividing number is 1
        int divideBy=1;
        //if the dividing number is less than or equal to the number the loop keeps going
        while(divideBy<=num){
            //factor is equal to the remainder of the number divided by the integer divided by
            int factor= num%divideBy;
            //If there are no more remainders then factors equals 0
            if (factor==0){
            //Outputs the factors of the number on one line
            System.out.printf(divideBy+", ");}
            //adds 1 to dividing number if possible
            divideBy++;
        } 
    }
}
