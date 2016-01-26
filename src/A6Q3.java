
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A6Q3 {
public static void factors(int numberos){
    for(int i = numberos; i > 0; i--){
        int possiblefactors = numberos % i;
        if(possiblefactors == 0){
       System.out.println(i);     
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the number");
     int I = input.nextInt();
     factors(I);
    }
}
