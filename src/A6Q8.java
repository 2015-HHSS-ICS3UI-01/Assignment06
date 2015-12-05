
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q8 {
    
    public static void season (int m){
        
        //make a scanner
        Scanner input = new Scanner (System.in);
        
        //tell the user to enter a day
        System.out.println("Please enter the day between 1 and 31.");
        
        //store the day in variable        
        int d = input.nextInt();
        
        
        //determine what season it is
        if (m == 12 && d >= 16 || m == 1 || m == 2 || m == 3 && d <= 15){
            System.out.println("The season is Winter.");
            
        }else if (m == 3 && d >= 16 || m == 4 || m == 5 || m == 6 && d <= 15){
            System.out.println("The season is Spring.");
            
        }else if (m == 6 && d >= 16 || m == 7 || m == 8 || m == 9 && d <= 15){
            System.out.println("The season is Summer.");
            
        }else{ System.out.println("The season is Fall.");
    }}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);
        
        //tell user to enter the month
        System.out.println("Please enter the month between 1 and 12.");
        
        //store the month in a variable
        int m = input.nextInt();
        
        //activate the method to determine the season
        season(m);
        
        //close the scanner 
        input.close();
    }
}
