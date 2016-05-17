
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
public class Question3 {

    //Returns factors of the number aka method to search for factors (...to be outputed at the end of the code...)
    public static void factor(int number) {
        //Look for a number that is less than 'number' 
        for (int n = 1; n <= number; n++) {
            //If the quotient divides evenly into the number, it is a factor. 
            if (number % n == 0) {
                System.out.println(n);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create a new scanner
        Scanner input = new Scanner(System.in);
        //Ask for a number 
        System.out.println("Enter a whole number ");
        //Creat variable to store the number
        int n = input.nextInt();
        //Tell the person what the factors are
        System.out.println("The factors of the number you entered are ");
        //Output the method above 
        factor(n);

    }

}
