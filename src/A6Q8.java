
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

        //checks the days and the month and prints out the season
        if (month == 12 && day >= 16) {
            System.out.println("The season is Winter");
        } else if (month <= 3 && day <= 15) {
            System.out.println("The season is Winter");
        } else if (month >= 3 && month <= 6) {
            System.out.println("The season is Spring");
        } else if (day <= 15 && day >= 16) {
            System.out.println("The season is Spring");
        } else if (month >= 6 && month <= 9) {
            System.out.println("The season is Summer");
        } else if (day <= 15 && day >= 16) {
            System.out.println("The season is Summer");
        } else if (month >= 9 && month <= 12) {
            System.out.println("The season is Fall");
        } else if (day >= 16 && day <= 15) {
            System.out.println("The season is Fall");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new printer
        Scanner input = new Scanner(System.in);

        //asks user for month as number
        System.out.print("Please enter month: ");
        int month = input.nextInt();
        //checks to see if month is between 1 and 12
        while (month < 1 || month > 12) {
            System.out.print("Enter a number between 1 to 12(month): ");
            month = input.nextInt();
        }
        //asks user for day as number
        System.out.print("Please enter day: ");
        int day = input.nextInt();
        //checks to see if day is between 1 and 31
        while (day < 1 || day > 31) {
            System.out.print("Enter a number between 1 to 31(day): ");
            day = input.nextInt();
        }
        //returns to season method
        season(month, day);
    }
}
