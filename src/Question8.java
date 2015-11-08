
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.print("What is the month? ");
        int month = input.nextInt();
        System.out.print("What is the day? ");
        int day = input.nextInt();
        System.out.println("The season is " + season(month, day));
    }
    public static String season(int month, int day) {
        String seasonType = "";
        if(month < 12 && month < 3){
            seasonType = "Winter";
        } else if(month == 3){
            if(day <= 15){
                seasonType = "Winter";
            } else{
                seasonType = "Spring";
            } 
        } else if(month > 3 && month < 6){
            seasonType = "Spring";
        } else if(month == 6){
            if(day <= 15){
                seasonType = "Spring";
            } else{
                seasonType = "Summer";
            }
        } else if(month > 6 && month < 9){
            seasonType = "Summer";
        } else if(month == 9){
            if(day <= 15){
                seasonType = "Summer";
            } else{
                seasonType = "Fall";
            }
        } else if(month > 9 && month > 12){
            seasonType = "Fall";
        } else if (month == 12){
            if(day <= 15){
                seasonType = "Fall";
            } else{
                seasonType = "Winter";
            }
        }
        return seasonType;
    }
}
