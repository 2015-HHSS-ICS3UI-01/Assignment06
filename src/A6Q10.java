
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

        if (partOne.contains("-") || partTwo.contains("-")) {
            for (int i = 0; i < partOne.length(); i++) {
                char dashes1 = partOne.charAt(i);
                char dashes2 = partTwo.charAt(i);

                if (dashes1 == dashes2) {
                    System.out.println("True");
                }
                //if (dashes1 != dashes2) {
                //    System.out.println("False");
                //}
            
            }
        }
        if (!partOne.contains("-") || !partTwo.contains("-")) {
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
