/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q5 {
    
    public static void chaotic(int asterlines){
        
        int linecount = 0;
       
       while (linecount < asterlines){
           
           int randNum = (int) (Math.random() * (5)) + 1;
           
           int asteriks = 0;
           
           while (asteriks < randNum){
               
               System.out.println("*");
               
               asteriks++;
           }
           System.out.println();
           linecount++;
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         // ask them the number of lines they want
         System.out.println("Please enter in the number of lines of asterisks you wish to have");
         int asterlines = input.nextInt();
         chaotic(asterlines);
    }
}
