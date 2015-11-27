
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q10 {

    public static boolean sameDashes(String one, String two) {
         for (int i = 1; i <= ; i++){
             
         }
        if (one.equals(two)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line with dashes");
        String one = input.nextLine();
        System.out.println("Enter another line with dashes");
        String two = input.nextLine();
        sameDashes(one, two);
    }
}
