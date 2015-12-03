
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q8 {
        public static void season(int month, int day){
            // puts out the season
           String calendar = "";
           // dates 
           if(month ==12 && day >=16 || month == 1 || month == 2)
               calendar = "Winter";
           else if(month ==3 && day <=15)
               calendar = "Winter";
           else if(month ==3 && day >=16 || month == 4 || month == 5)
               calendar = "Spring";
           else if(month ==6 && day <=15)
               calendar = "Spring";
           else if(month ==6 && day >=16 || month == 7 || month == 8)
               calendar = "Summer";
           else if(month ==9 && day <=15)
               calendar = "Summer";
           else if(month ==9 && day >=16 || month == 10 || month == 11)
               calendar = "Fall";
           else if(month ==12 && day <=15)
               calendar = "Fall";
        // what season is it
        System.out.println("You are in the season of " + calendar);
        }
            
           
          
        
            
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        // enter a month
        System.out.println("Please enter a month between 1-12.");
        int month = input.nextInt();
        //enter a day
        System.out.println("Please enter a day in between 1-31.");
        int day = input.nextInt();  
        // formula
        season(month, day);
        
        
        
        
    }
}
