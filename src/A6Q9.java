/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q9 {
    
    public static boolean allDigitsOdd(int num){
        
        while (true){
            
             int lastdigit = num % 10;
             // odd numbers are to return as true
             if (lastdigit == 9 || lastdigit == 7 || lastdigit == 5 || lastdigit == 3 || lastdigit == 1){
                 
                 num = num / 10;
             }
              // even numbers are to return as false       
             if (lastdigit == 8 || lastdigit == 6 || lastdigit == 4 || lastdigit == 2){
                 
                 return false;
             } 
             
             if(num == 0){
                 
                 break;
             }
        }        
        
      return true;  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ask the user for a number
        System.out.println("Please enter a number");
        int num  = input.nextInt();
        // boolean for digit to store the final answer
        boolean digit = allDigitsOdd(num);
        // tell them if their number is true or false
        System.out.println("Your number is " + digit);       
    }
}
