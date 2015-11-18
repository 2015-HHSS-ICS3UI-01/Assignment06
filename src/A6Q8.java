
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generates a scanner
        Scanner in = new Scanner(System.in);
        // Asks for month and day
        System.out.println("Enter the month, and the day please.");
        int month = in.nextInt();
        int day = in.nextInt();
        
        // Exeuctes and stores the string
        String answer = season(month,day);
        // Gives the answer
        System.out.println("It's " + answer+ "!");
        
    }
    // Season method, that does the thinking portion
    public static String season(int month, int day){
        // declared a variable string that is empty until further identification 
        String date = "";
        // each and one of these corrospond to months/days and prints out their season
        if (month <= 3 && day <= 15){
            date = "Winter";
        }else if (month <= 3 && day >=16){
            date = "Spring";
        }else if (month <=6 && day <=15){
            date="Spring";
        }else if (month <= 6 && day >=16){
            date = "Summer";
        }else if (month <= 9 && day <=15){
            date= "Summer";
        }else if (month <=9 && day >=16 ){
        date = "Fall";  
        }else if (month <=12 && day <=15){
            date= "Fall";
        }else if (month <=12 && day >=16){
            date = "Winter";
        }
        // returns the season
        return date;
    }
}
