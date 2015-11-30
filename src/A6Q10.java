
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q10 {

    public static void sameDashes(String dashes1, String dashes2) {

        System.out.print("Loading");
        for (int i = 7; i > 0; i--) {
            System.out.print(".");

            //delay 750 milliseconds
            try {
                Thread.sleep(750);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("HI");
    
    
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
