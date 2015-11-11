
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Q6A6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(int num){
        int dig = num % 10;
        if(dig<0){
            dig = dig * -1;
        }
        return dig;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int dig = lastDigit(num);
        System.out.println(dig);
    }
}
