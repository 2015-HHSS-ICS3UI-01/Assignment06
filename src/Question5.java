
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
public class Question5 {

    public static void alotofstars(int numberlines) {

        //Create an int called line count and set it to 0 
        int linecount = 0;
        //While the linecount < than the number of lines entered by the person and make up a random number then repeat  
        while (linecount < numberlines) {
            //Come up with a random number between 1 and 5 which will then be stored in the variable
            int randNum = (int) (Math.random() * (5)) + 1;
            //Set asterisks equal to 0 
            int stars = 0;
            //as long as the asterisks < the the random number output an asterisks then put another to the end each time  
            while (stars < randNum) {
                System.out.print("****");
                stars++;
            }
            //Add another line to the line count 
            linecount++;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner 
        Scanner input = new Scanner(System.in);
        //Ask for a number of lines 
        System.out.println("Please enter the number of lines you would like to print");
        //Allow the person to input their desired amount of lines
        int numberlines = input.nextInt();
        //Return the method 
        alotofstars(numberlines);

    }

}
