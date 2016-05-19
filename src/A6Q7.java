
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    
    public static int firstDigit (int num){
        int n = num;
        if (n < 0){
            n = n*-1;
        }
        while (n > 10){
            n = n/10;
        }
        System.out.println(n);
        return n;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Please input a number.");
        int num = input.nextInt();
        int firstDigit = firstDigit(num);
        }
    }
}
