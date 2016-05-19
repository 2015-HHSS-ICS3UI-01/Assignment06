
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastdigit (int X5){
        int ld = X5;
        ld = ld%10;
        if (ld < 0 ){
         ld = ld*-1;
        } 
        System.out.println("the last digit is " + ld);
        return ld;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       while (true){
        System.out.println("input number");
        int X5 = input.nextInt();
        int lastdigit = lastdigit(X5);
    }
}
}