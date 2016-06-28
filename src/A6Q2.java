
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pintm1551
 */
public class A6Q2 {

    public static String examGrade(int g) {
        String mrk = "N/A";                                             //in case mark is above or below 100%
            if (g >= 80 && g <= 100) {                                  //finds which letter fits the grade %
                mrk = "A";
            }
            if (g >= 70 && g <= 79) {
                mrk = "B";
            }
            if (g >= 60 && g <= 69) {
                mrk = "C";
            }
            if (g >= 50 && g <= 59) {
                mrk = "D";
            }   
            if (g >= 0 && g <= 49) {
                mrk = "F";
            }
       return mrk;                                                      //returns mark
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input your grade %");                       //Asks to print grade %
        Scanner input = new Scanner(System.in);                         //Create Scanner
        int g = input.nextInt();                                        //Recieves G
        System.out.println("Your exam grade is " + examGrade(g));       //Prints grade letter
    }
}
