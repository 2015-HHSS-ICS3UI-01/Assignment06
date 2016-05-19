
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    
    public static int lastDigit(int num) {
        int n = num;
        n = n%10;
        if (n < 0){
            n = n*-1;
        }
        System.out.println(n);
        return n;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Input your number.");
            int num = input.nextInt();
            int lastDigit = lastDigit(num);
        }
    }
}
