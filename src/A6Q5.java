
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q5 {

    public static void chaotic (int n){
        
        while (n>0){
                        
            int randomNumber = (int)(Math.random()*100) + 1;
            
        if (randomNumber >= 0 && randomNumber <= 19){
            System.out.println("*");
        }else if (randomNumber >= 20 && randomNumber <= 39){
            System.out.println("**");
        }else if (randomNumber >= 40 && randomNumber <= 59){
            System.out.println("***");
        }else if (randomNumber >= 60 && randomNumber <= 79){
            System.out.println("****");
        }else if (randomNumber >= 80 && randomNumber <= 100){
            System.out.println("*****");
        }
        n = n-1;
    }}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make a new scanner
        Scanner input = new Scanner (System.in);
        
        //tell user to enter a number
        System.out.println("Please enter a number");
        
        //store the number
        int n = input.nextInt();
        
        //activate method
        chaotic (n);
        
        //close scanner
        input.close();
     
    }
}
