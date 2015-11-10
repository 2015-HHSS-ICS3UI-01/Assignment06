
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void factors(int num) {
        System.out.println(1);
        for(int inc = 2; inc != num; inc++){
            int check = num % inc;
            if(check==0){
                System.out.println(inc);
                if(num/inc==inc){
                    System.out.println(inc);
                }
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number and Get the factors.");
        Scanner input = new Scanner(System.in);
        factors(input.nextInt());
    }
}
