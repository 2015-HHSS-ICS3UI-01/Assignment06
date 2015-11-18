
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
        
        
        
        for (int lines = 0; lines <= n; lines = lines ++){
            
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
        
    }}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter a number");
        
        int n = input.nextInt();
        
        chaotic (n);
     
    }
}
