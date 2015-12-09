
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A6Q3 {
    //make a procedure 
    public static void factor(int number){
    //Create loop for finding factors in the number
      for(int factors = 1; factors <= number; factors++){
          //find remainder of every number up to the one chosen
          int remainder = (number%factors);
          //numbers that have a remainder of 0 divide evenly and are outputted    
           if (remainder == 0){
               System.out.println("A number that factors into " + number + " is " + factors);
          }
      } 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
       Scanner in = new Scanner(System.in);
       //ask user what number they are choosing        
        System.out.println("Enter a number that you want to know the factors of");
        //Store the number in an integer
        int number = in.nextInt();
        //run the public static void
        factor(number);
    }
}
