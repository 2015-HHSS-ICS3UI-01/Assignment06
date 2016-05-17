//
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question7 {

    public static int firstdigit(int numbervalue) {
        //if the number < 0, mutiply by -1 to make it positive  
        if (numbervalue < 0) {
            numbervalue = numbervalue * (-1);
        }
        //if number entered > 10 then divide by 10 until it no longer has double digits
        while (numbervalue >= 10) {
            numbervalue = numbervalue / 10;
        }
        //Return the number value
        return numbervalue;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner  
        Scanner input = new Scanner(System.in);

        //Tell the user to input a number
        System.out.println("Please enter a number ");
        //Allow the person to enter a number 
        int number = input.nextInt();
        //Output the answer
        int first = firstdigit(number);
        //Output the first digit of their number
        System.out.println("The first digit of the number is " + first);

    }

}
