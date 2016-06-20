/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/** 
 *
 * @author godie2014
 */
public class allDigitsOdd {

    public static void alldigitsodd(int a) {
        //input new scanner
        Scanner input = new Scanner(System.in); 
// Count digits at zero
        int d = 0;

   

        while (a > 0) {
        }
        // first number
        int n = a % 10;
//odd numbers
        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 9) {
//divide by 10
            a = a / 10;
// add a count to show that its odd
            d = d + 1;
// if the number is zero or below break
            if (a <= 0) { break;}
        }
            

// add a count
        } else { d=0; break;}
        
    }
           
       
// if count is greater than zero it is true
    if ( d > 0){
System.out.println("True");
    
            
// if the amount of odd numbers is zero than its false
}else if (t==0){
   System.out.println("False");

    
        
            


}}
public static void main(String[] args) {

// make a scanner
        Scanner input = new Scanner(System.in);
// tell user to enter a set of digits
        System.out.println("Please enter set of digits");
// store in a variable
        int a = input.nextInt();
//start method to see if they are odd
        alldigitsodd(a);
//close scanner
        input.close();
}}
