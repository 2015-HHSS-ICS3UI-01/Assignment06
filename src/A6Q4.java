
import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // generates scanner
        Scanner in = new Scanner(System.in);
        // Asks for principle (initial amount) rate and amount of years and stores them in double and int for years
        System.out.println("Please enter the initial amount, rate and the amount of years");
        double principle = in.nextInt();
        double rate = in.nextInt();
        int year = in.nextInt();
        // executes method and stores the answer in a double answer
        double answer = CompoundInterest(principle,rate,year);
        // Prints out the answer once method is successfully executed
        System.out.println("Your balance is $" +answer );
       
        // Assistant method used for calculations
    }public static double CompoundInterest(double principle, double rate, int year){
        // A formula I generated that adds 1 to rate, simplifying it down
        double r1 = (rate + 1);
        
        // Formula used to find the balance using math.pow as an exponent
        double balance = principle*Math.pow(r1,year);
        // returns answer!
        return balance;
        
    }
    
}
