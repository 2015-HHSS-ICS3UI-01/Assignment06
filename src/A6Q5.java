
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a range of numbers ");
        int a = in.nextInt();
        int n = in.nextInt();
        
      
        
        chaotic(a,n,);
    }
    public static void chaotic(int a, int n){
         int randNum = (int)(Math.random()*(n - a + 1))+ a;
         
         
         
         for(; n > a; n--){
             for(randNum){
             System.out.println("*");
         }
         }
    }
    
}
