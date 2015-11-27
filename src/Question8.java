
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question8 {

    public static void season(int month, int day){      
        if(day >= 16 && day <= 15 && month == 12 && month <= 3){
            System.out.println("Winter");
        }if(day >= 16 && day <= 15 && month >= 3 && month <= 6){
            System.out.println("Spring");
        }if(day >= 16 && day <= 15 && month >= 6 && month <= 9){
            System.out.println("Summer");
        }if(day >= 16 && day >= 15 && month >= 9 && month <= 12){
            System.out.println("Fall");
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter a month");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println("Please enter a day");
        int day = input.nextInt();
        season(month, day);
        
        
    }
}
