
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q9 {

    public static boolean allDigitsOdd(int allOdd) {
        while (true) {
            //Separates last number
            int last = allOdd % 10;
            //Checks if number is odd/even(would return false)/0(which then it would be all odd)
            if (allOdd == 0) {
                break;
            } else if (last == 0 || last == 2 || last == 4 || last == 6 || last == 8) {
                return false;
            } else {
                allOdd = allOdd / 10;
            }
        }
        return true;


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input
        Scanner input = new Scanner(System.in);
        //Ask user for number to check if all odd
        System.out.println("Put in number");
        int allOdd = input.nextInt();
        //Outputs result
        System.out.println(allDigitsOdd(allOdd));
    }
}
