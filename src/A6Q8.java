
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static String season(int month, int day){
        String season = "Invalid date.";
        if(month < 1
                || month > 12
                || day < 1
                || day > 31){
            season = "Invalid date.";
        }else if((month == 12
                && day >= 16)
                || month < 3
                || (month == 3
                && day <= 15)){
            season = "Winter";
        }else if(month == 4
                || (month == 3
                && day >= 16)
                || (month == 6
                && day <= 15)){
            season = "Spring";
        }else if(month == 7 
                || month == 8
                || (month == 6
                && day >= 16)
                || (month == 9
                && day <= 15)){
            season = "Summer";
        }else if(month == 10
                || month == 11
                || (month == 9
                && day >= 16)
                || (month == 12
                && day <= 15)){
            season = "Fall";
        }
        return season;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the mounth.");
        int month = input.nextInt();
        System.out.println("Enter the number of what day it is.");
        int day = input.nextInt();
        System.out.println("The season you are in is " + season(month,day) + ".");
    }
}
