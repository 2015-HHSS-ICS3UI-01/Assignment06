
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
public class Question6 {

    //Make a method to output the last digit of the entered number
    public static int finaldigit(int number) {
        //If the number is '-' then mutiply by -1 so it becomes positive
        if (number < 0) {
            number = number * (-1);

        }
        //Take the last digit and return it by dividing by 10
        number = number % 10;
        return (number);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask the person to input a number  
        System.out.println("Please enter a number ");
        int number = input.nextInt();
        //Output the answer 
        int last = finaldigit(number);
        //Output the person's last digit of the number entered 
        System.out.println("The last digit of the number is " + last);

    }

}
