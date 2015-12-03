
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author snowc4636
 */
public class A6Q9 {

    public static boolean allDigitsOdd(int odd) {
        // what number is
        while (true) {
            int number = odd % 10;

            if (number == 9 || number == 7 || number == 5 || number == 3 || number == 1) {
                odd = odd / 10;
            }else if (number == 8 || number == 6 || number == 4 || number == 2) {
                return false;

            }
            if (number == 0){
                break;
            }
                

        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = input.nextInt();
        // formula
        System.out.println(allDigitsOdd(number));
    }
}
