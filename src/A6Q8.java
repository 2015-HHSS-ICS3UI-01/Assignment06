
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner 
        Scanner in = new Scanner(System.in);
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a Month: ");
        int month = in.nextInt(); 
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a Day: ");
        int day = in.nextInt(); 
        
        // Execute Method 
         season(month, day); 
    }
    // Using the Season Method 
    public static void season(int month, int day) {
        
        // Output our sentence to the user letting them know what they entered
        // Outputs specific month and day according to what numbers the user input
       if(month <=3 && day <=15) { 
           System.out.println("The season is Winter");
    } else if(month <=3 && day >=16) {
           System.out.println("The season is Spring");
    } else if(month <=6 && day <=15) {
           System.out.println("The season is Spring");
    } else if(month <=6 && day >=16) {
           System.out.println("The season is Summer");
    } else if(month <=9 && day <=15) {
           System.out.println("The season is Summer");
    } else if(month <=9 && day >=16) {
           System.out.println("The season is Fall");
    } else if(month <=12 && day <=15) {
           System.out.println("The season is Fall");
    } else if(month <=12 && day >=16) {
           System.out.println("The season is Winter");
    }
        
     ; 
      
    }
    
    
    
    
}
