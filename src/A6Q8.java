
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q8 {

    public static void season(int month, int day) {
        // on jan to feb print winter
        if (month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 12) {
            //if its dec print fall if its earlier than 16 if later print winter 
            if (day >= 16) {
                System.out.println("Winter");
            } else {
                System.out.println("Fall");
            }
        } else if (month == 3) {
            //if its march print winter if its earlier than 16 if later print spring
            if (day <= 15) {
                System.out.println("Winter");
            } else {
                System.out.println("Spring");
            }
        }
        //on april and may print spring
        if (month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6) {
            //if its june print spring if its earlier than 16 if later print summer
            if (day <= 15) {
                System.out.println("Spring");
            } else {
                System.out.println("Summer");
            }
        }
        //on july and august print summer
        if (month == 7 || month == 8) {
            System.out.println("Summer");
            //if its sept print out summer if its earlier than 16 if later print Fall
        } else if (month == 9) {
            if (day <= 15) {
                System.out.println("Summer");
            } else {
                System.out.println("Fall");
            }
        }
        //on oct and nov print out fall
        if (month == 10 || month == 11) {
            System.out.println("Fall");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask month
            System.out.println("Please type month (from 1 to 12)");
            int month = input.nextInt();
            //ask day
            System.out.println("Please type day");
            int day = input.nextInt();
            //bring method above
            season(month, day);
        }
    }
}
