
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q8 {

    public static void season(int x, int y) {

        if (x > 0 && x <= 12 && y > 0 && y <= 31) {

            if (x == 12 && y >= 16) {
                System.out.println("Winter");
            }
            if (x <= 2) {
                System.out.println("Winter");
            }
            if (x == 3 && y <= 15) {
                System.out.println("Winter");
            }
            if (x == 3 && y > 15) {
                System.out.println("Spring");
            }
            if (x == 4 || x == 5) {
                System.out.println("Spring");
            }
            if (x == 6 && y <= 15) {
                System.out.println("Spring");
            }
            if (x == 6 && y > 15) {
                System.out.println("Summer");
            }
            if (x == 7 || x == 8) {
                System.out.println("Summer");
            }
            if (x == 9 && y <= 15) {
                System.out.println("Summer");
            }
            if (x == 9 && y > 15) {
                System.out.println("Fall");
            }
            if (x == 10 || x == 11) {
                System.out.println("Fall");
            }
            if (x == 12 && y <= 15) {
                System.out.println("Fall");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        season(9, 15);
    }
}
