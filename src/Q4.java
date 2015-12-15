
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make a scanner 
        Scanner in = new Scanner(System.in);

        //ask user for the initial value
        System.out.println("Please input the initial value");

        //input the initial value
        double initialValue = in.nextDouble();

        //ask user for the initial value
        System.out.println("Please input the interest percentage");
       
        //input the initial value
        double interest = in.nextDouble();

        //make the interest into a percentage
        double percentInterest = interest/100;
        //ask user for the initial value
        System.out.println("Please input the number of years");

        //input the initial value
        int years = in.nextInt();

        //run the compundInterest method
        double finalAmount = Math.round(compoundInterest(initialValue, percentInterest, years));
        
        //output the final amount
        System.out.println("The final amount is $" + finalAmount);
    }

    public static double compoundInterest(double initialValue, double percentInterest, int years) {

        //calculate the final product
        return Math.pow((1 + percentInterest), years)*initialValue;    
    }
}
