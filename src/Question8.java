
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//
/**
 *
 * @author howen2217
 */
public class Question8 {
    // create a method to determine the season based on month and day

    public static void seasons(int month, int day) {
        //12/16-3/15
        if (month >= 1 && month <= 2) {
            System.out.println("Winter");
        }
        if (month == 3) {
            if (day >= 16) {
                System.out.println("Spring");
            } else {
                System.out.println("Winter");
            }
        }
        //3/16-6/15
        if (month >= 4 && month <= 5) {
            System.out.println("Spring");
        }
        if (month == 6) {
            if (day >= 16) {
                System.out.println("Summer");
            } else {
                System.out.println("Spring");
            }
        }
        //6/16-9/15
        if (month >= 7 && month <= 8) {
            System.out.println("Summer");
        }
        if (month == 9) {
            if (day >= 16) {
                System.out.println("Fall");
            } else {
                System.out.println("Summer");
            }
        }
        //9/16-12/15
        if (month >= 10 && month <= 11) {
            System.out.println("Fall");
        }
        if (month == 12) {
            if (day >= 16) {
                System.out.println("Winter");
            } else {
                System.out.println("Fall");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input and send the month and day to the method
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day as a number between 1 and 31");
        int day = input.nextInt();
        System.out.println("Please enter the month as a number between 1 and 12");
        int month = input.nextInt();
        seasons(month, day);
    }
}
