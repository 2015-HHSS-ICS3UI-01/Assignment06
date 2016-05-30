
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question3 {
    //create a method to find the factors of the inputed number

    public static void factor(int num) {
        for (int divend = 1; divend <= num; divend++) {
            if (num % divend == 0) {
                System.out.println(divend);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new scanner and input and store a number
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number:");
        int num = input.nextInt();
        //put number into method
        factor(num);
    }
}
