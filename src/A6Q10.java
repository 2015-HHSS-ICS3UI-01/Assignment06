
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q10 {

    public static void sameDashes(String first, String second) {

        String x = first;
        String y = second;

        boolean flag = true;
        int count = 0;

        while (count < x.length()) {
            if (x.indexOf("-") != y.indexOf("-")) {
                flag = false;
            }
            x = x.replaceFirst("-", "");
            y = y.replaceFirst("-", "");
            count = count + 1;
        }
        System.out.println(flag);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String x = input.nextLine();

        System.out.println("Enter the second string:");
        String y = input.nextLine();

        sameDashes(x, y);
    }
}
