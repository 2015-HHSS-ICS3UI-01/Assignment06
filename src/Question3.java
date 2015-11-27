
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question3 {

    public static void factors (int number){
    for(int i = number; i > 0; i--){
        int factoredNumber = number % i;
        if(factoredNumber == 0){
            System.out.println(i);
        }
           
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to factor");
        int number = input.nextInt();
        factors(number);
        
    }
}
