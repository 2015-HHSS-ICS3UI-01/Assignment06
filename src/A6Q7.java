

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A6Q7 {
public static void firstDigit(int n){
int i = n/10;
System.out.println("the first diget is " + i  );
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner input = new Scanner(System.in);
System.out.println("enter a number");
int i = input.nextInt();
firstDigit(i);

    }
}
