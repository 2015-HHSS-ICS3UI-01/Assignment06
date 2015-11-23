
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

    public static void allDigitsOdd(int allOdd) {
        while(true){
             if (allOdd == 1 || allOdd == 3 || allOdd == 5 || allOdd == 7 || allOdd == 9) {
            System.out.println("True");
            break;
        } else if (allOdd == 0 || allOdd == 2 || allOdd == 4 || allOdd == 6 || allOdd == 8) {
            System.out.println("False");
            break;
        } else {
            allOdd = allOdd / 10;
        }
        }
       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in number");
        int allOdd = input.nextInt();
        
        allDigitsOdd(allOdd);
    }
}
