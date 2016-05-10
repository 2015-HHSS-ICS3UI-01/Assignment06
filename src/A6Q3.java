
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q3 {

    public static void num(int num) {
        //divide number from 1 to the number
        for (int i = 1; i <= num; i++) {
            StringBuilder ans = new StringBuilder();
            if (num % i == 0) {
                //print out the number that doesn't have remainder
                ans.append(i);
                System.out.println("factors(" + num + ") would print out the numbers " + ans);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            //ask for number
            System.out.println("Please enter number");
            int num = input.nextInt();
            //bring the factor of number input from method above
            num(num);
        }
    }
}
