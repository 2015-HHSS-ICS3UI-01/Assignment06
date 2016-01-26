
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A6Q6 {
public static void lastDigit(int n){
int i = n%10;
System.out.println("the last diget is " + i);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("enter a number");
int i = input.nextInt();
lastDigit(i);


}
    }

