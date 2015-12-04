
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A6Q8 {

    public static void season (int month, int day){
        
        //find if the date is in winter
        if((month == 12 && day >= 16) 
                || month == 1
                || month == 2       
                ||(month == 3 && day <= 15)){
            System.out.println("The season is Winter.");
        }
        
        //find if the date is in spring
         if((month == 3 && day >= 16) 
                || month == 4
                || month == 5       
                ||(month == 6 && day <= 15)){
            System.out.println("The season is Spring.");
        }
         
        // find if the date is in summer
          if((month == 6 && day >= 16) 
                || month == 7
                || month == 8       
                ||(month == 9 && day <= 15)){
            System.out.println("The season is Summer.");
        }
          
          //find if the date is in fall
           if((month == 9 && day >= 16) 
                || month == 10
                || month == 11      
                ||(month == 12 && day <= 15)){
            System.out.println("The season is Fall.");
        }
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make the scanner
        Scanner input = new Scanner(System.in);
        
        
        //Ask the for the month
        System.out.println("Enter a number between 1 and 12 for the month( 1 is January, 2 is February and so one).");
        int month = input.nextInt();
        
        //ask for the day
        System.out.println("Enter a number between 1 and 31 for the day.");
        int day = input.nextInt();
       
        //run the method
        season( month,  day);
    }
}

