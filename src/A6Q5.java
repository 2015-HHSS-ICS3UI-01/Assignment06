/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q5 {
    //method that randomly prints out 1-5 stars
    public static void chaotic() {
        //infinite loop
        while (true) {
         //create a random number from 1-5
         int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
         
         // if the random number is 1
         if(randNum == 1){
             //print out 1 asterisk
         System.out.println("*");
         } //if the random number is 2
         else if(randNum == 2){
             //print out 2 asterisks 
             System.out.println("**");
         } //if the random number is 3
         else if(randNum == 3) {
             //print out 3 asterisks 
             System.out.println("***");
         } // if the random number is 4
         else if(randNum == 4) {
             //print out 4 asterisks 
             System.out.println("****");
         } //if the random number is 5
         else {
             //print out 5 asterisks 
             System.out.println("*****");
         }
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the program
        chaotic();
    }
}
