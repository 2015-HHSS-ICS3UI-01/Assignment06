
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q8 {

    public static String Season(int m, int d) {
        String ans = "Winter";                                                  //large comparison of dates to check season
        if (m == 1) {
            ans = "Winter";
        }
        if (m == 2) {
            ans = "Winter";
        }
        if (m == 3) {
            if (d >= 16) {
                ans = "Spring";
            } else {
                ans = "Winter";
            }
        }
        if (m == 4) {
            ans = "Spring";
        }
        if (m == 5) {
            ans = "Spring";
        }
        if (m == 6) {
            if (d >= 16) {
                ans = "Summer";
            } else {
                ans = "Spring";
            }
        }
        if (m == 7) {
            ans = "Summer";
        }
        if (m == 8) {
            ans = "Summer";
        }
        if (m == 9) {
            if (d >= 16) {
                ans = "Fall";
            } else {
                ans = "Summer";
            }
        }
        if (m == 10) {
            ans = "Fall";
        }
        if (m == 11) {
            ans = "Fall";
        }
        if (m == 12) {
            if (d >= 16) {
                ans = "Winter";
            } else {
                ans = "Fall";
            }
        }
        return ans;                                                             //returns 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input a month");                                    //Asks to input month
        int m = input.nextInt();                                                //recieves number
        System.out.println("Input a day");                                      //Asks to input day
        int d = input.nextInt();                                                //recieves number
        System.out.println(Season(m, d));                                        //prints answer
    }
}
