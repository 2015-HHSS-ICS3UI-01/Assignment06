
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 2 desired phrases");
        String first = in.nextLine();
        String second = in.nextLine();

        boolean answer = sameDashes(first, second);
        System.out.println(answer);

    }

    public static boolean sameDashes(String first, String second) {
        while (true) {
            char first1 = first.charAt(0);
            char second1 = second.charAt(0);
            if (second1 != '-' && first1 == '-') {
                return false;
                
            }
            else if (second1 == '-' && first1 != '-') {
                return false;
            }
            
            first = first.substring(0,1);
            second = second.substring(0,1);
            first = first.replace(first, "");
            second = second.replace(second, "");
            
           

            if (second1 == '-' || first1 == '-') {
                return true;
            }
            
        }

    }
}
