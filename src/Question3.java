
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question3 {
    //create procedure method that stores number from main method as 'number'
    public static void factors(int number){
        //create for loop that goes through all numbers between 1 and number
        for(int factor = 1;factor <= number; factor++){
            //store remainder of number in 'remainder'
            int remainder = number % factor;
            //if remainder is 0 (number is a factor) print factor
            if(remainder == 0){
                //print factor
                System.out.println(factor);
            }
        }
    }

    public static void main(String[] args) {
        //call on method and send number
        factors(73);
        
    }
}
