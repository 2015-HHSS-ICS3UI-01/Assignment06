
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A6Q5 {

    public static void chaotic(int numberlines) {


       //set a integer called line count and set to 0
        int linecount = 0;
       //while the linecount is less than the number if lines entered the user generate a random number and repeat 
        while (linecount < numberlines) {
            //generate random number between 1 and 5 and store in variable
            int randNum = (int) (Math.random() * (5)) + 1;
             //set asterisks to 0
            int asterisks = 0;
            //as long as the asterisks is less the the random number print a asterisks and add one each time 
            while (asterisks < randNum) {
                System.out.print("*");
                asterisks++;
            }
            System.out.println();
            //add one to the line count each time 
            linecount++;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);
        //ask user amount of lines they would like to print 
        System.out.println("please enter the number of lines you would like to print");
        //allow ussers to enter amount of lines
        int numberlines = input.nextInt();
      //retunr to method above 
        chaotic(numberlines);



    }
}
