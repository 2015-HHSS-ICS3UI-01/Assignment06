

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
     public static int AllDigitsOdd(int X9) {
        X9 = Math.abs(X9);
        while (X9 > 0){
            int digit = X9 % 10;
            // Scans the numbers starting with the last number
            if (digit % 2 == 0){
            System.out.println("this number is even"); 
            X9 = X9/10;
            }else if (digit % 2 != 0){
            System.out.println("This number is odd");
            X9 = X9/10;
            }
            } 
         System.out.println("if you see 'this number is even' it is False ");
         System.out.println("if you see all number are odd it is True");
     return X9;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int X9 = input.nextInt();
        int AllDigitsOdd = AllDigitsOdd(X9);
    
}
}