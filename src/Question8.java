
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question8 {

    public static int season(int m, int d) {
        //The formula finds a number from month and day to give back to the main method.
        m = m * 100;
        int s = m + d;
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a month.");
        //The user inputs a month and a day so a season can be determined.
        int month = input.nextInt();
        System.out.println("Please input a day.");
        int day = input.nextInt();
        //The method season is called to get a integer for the exact month and day.
        int answer = season(month, day);
        //If statements find which season the returned number fits in.
        if (answer >= 1216 || answer <= 315) {
            System.out.println("Winter");
        } else if (answer >= 316 && answer <= 615) {
            System.out.println("Spring");
        } else if (answer >= 616 && answer <= 915) {
            System.out.println("Summer");
        } else if (answer >= 915 && answer <= 1215) {
            System.out.println("Fall");
        }

    }
}
