
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A6Q8 {

    public static String season(int month, int day) {
        String season = "winter";




        if (month < 4) {
            season = "winter";

        }
        
        
        else  if (month == 3) {
            if (day < 16) {
                season = "winter";
            }
            } else {
                season = "spring";
            }
          if (month > 3 && month < 6) {
                season = "spring";

            }
            else if  (month == 6) {
                if (day < 16) {
                    season = "spring";
                }
            } else {
                season = "summer";
            }

        




        return season;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user what month it is 
        System.out.println("What month is it? ");
        //allow user to enter date
        int month = input.nextInt();
        //ask user what the day of the month is 
        System.out.println("What day of the month is it ?");
        //allow user to enter day of month 
        int day = input.nextInt();

        String currentseason = season(month, day);

        System.out.println("The season is " + currentseason);


    }
}
