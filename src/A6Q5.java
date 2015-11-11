/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q5 {
    public static void chaotic() {
        while (true) {
         int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
         if(randNum == 1){
         System.out.println("*");
         } else if(randNum == 2){
             System.out.println("**");
         } else if(randNum == 3) {
             System.out.println("***");
         } else if(randNum == 4) {
             System.out.println("****");
         } else if(randNum == 5) {
             System.out.println("*****");
         }
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        chaotic();
    }
}
