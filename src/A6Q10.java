
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author preej0747
 */
public class A6Q10 {

    public static void sameDashes(String partOne, String partTwo) {

        int dashes = partOne.indexOf("-");
        int dashes2 = partTwo.indexOf("-");

        if (dashes == dashes2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please type something in: ");
        String dashes1 = input.next();

        System.out.print("Please Type something else: ");
        String dashes2 = input.next();

        sameDashes(dashes1, dashes2);
    }
}
