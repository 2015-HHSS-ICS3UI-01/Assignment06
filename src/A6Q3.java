
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter a number");
        int number = in.nextInt();
        
        System.out.println("factors (" +number+ ")whould print out the numbers" );
    }
    public static int Factors(int number){
        
       int answer = (number/2);
            
        return answer;
        
    }
}

