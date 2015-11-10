
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int lineN) {
        for(int inc=0; inc != lineN; inc++){
            int randNum = (int)(Math.random()* 5)+ 1;
            for(int inc2=0; inc2 != randNum; inc2++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number.");
        Scanner input = new Scanner(System.in);
        chaotic(input.nextInt());
    }
}
