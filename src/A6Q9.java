
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static boolean allDigitsOdd(int num){
        boolean odd = true;
        if(num<0){
            num = num * -1;
        }else if(num == 0){
            odd = false;
        }
        while(num>0
                && odd){
            if(num % 2 == 1){
                num = num/10;
            }else{
                odd = false;
            }
        }
        return odd;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number.");
        int num = input.nextInt();
        if(allDigitsOdd(num)){
            System.out.println("They were all odd.");
        }else{
            System.out.println("They were not all odd.");
        }
    }
}
