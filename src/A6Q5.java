
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void Chaotic (int asterisk) {  
   for (int num = 0; num < asterisk; num = num+1){
    int X4 =(int)(Math.random()*(5-1+1))+1;
    if (X4 == 1){
        System.out.println("*");
    }
    if (X4 == 2){
        System.out.println("**");
    }
    if (X4 == 3){
        System.out.println("***");
    }
    if (X4 == 4){
        System.out.println("****");
    }
    if (X4 == 5){
        System.out.println("*****");
    }
   }
   
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Chaotic(7);
         
    }
}
