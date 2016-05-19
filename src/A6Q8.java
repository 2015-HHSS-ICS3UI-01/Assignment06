
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static String seasons (int month, int day){
     int m = month;
     int d = day;
     String t = "is your season";
     while (true){
       if (month < 3 || (month == 3 && day <= 15)) {
            System.out.println("Winter " + t);
        } else if (month < 6 || (month == 6 && day <= 15)) {
            System.out.println("Spring " + t);
        } else if (month < 9 || (month == 9 && day <= 15)) {
            System.out.println("Summer " + t);
        } else if (month < 12 || (month == 12 && day <= 15)) {
            System.out.println("Fall " + t); 
        } 
       return t;
        }
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("pick the month");
        int month = input.nextInt();
        System.out.println("pick the day");
        int day = input.nextInt();
        String seasons = seasons (month, day);  
        }
        
    }

