
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter any digit thou desirest!");
        int digit = in.nextInt();
        
        boolean answer = allDigitsOdd(digit);
        System.out.println(answer);
    }
    public static boolean allDigitsOdd(int digit){
        int divided = digit/1;
        int answer = divided%10;
         
       while(divided > 10){
            
           if(answer == 2 && answer == 4 && answer == 6 && answer == 8){
             divided = divided/10;
           answer = (divided%10);
           
       }else{
               return false;
               
           }
               
       }
        return true;
        
    }
}
