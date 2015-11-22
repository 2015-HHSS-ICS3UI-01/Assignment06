
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q8 {

    public static void season(int month, int day) {

        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String fall = "Fall";

        if (month == 12 && month <= 3 || day <= 15 && day >= 16) {
            System.out.println("The season is " + winter);
        }
        if (month >= 3 && month <= 6 || day <= 15 && day >= 16) {
            System.out.println("The season is " + spring);
        }
        if (month >= 6 && month <= 9 || day <= 15 && day >= 16) {
            System.out.println("The season is " + summer);
        }
        if (month >= 9 && month <= 12 || day >= 16 && day <= 15) {
            System.out.println("The season is " + fall);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month: ");
        int month = input.nextInt();

        while (month < 1 || month > 12) {
            System.out.print("Enter a number between 1 to 12(month): ");
            month = input.nextInt();
        }

        System.out.print("Please enter day: ");
        int day = input.nextInt();

        while (day < 1 || day > 31) {
            System.out.print("Enter a number between 1 to 31(day): ");
            day = input.nextInt();
        }

        season(month, day);

    }
}
