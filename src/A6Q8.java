
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    
    public static int seasons (int month, int day, int time){
        int s1 = month;
        int s2 = day;
        int s3 = time;
        return time;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a month.");
        int s1 = input.nextInt();
        System.out.println("Please enter a day of the month.");
        int s2 = input.nextInt();
        while (true){
        if((s1 == 12 && s2 >= 16 && s2 <= 31) || (s1 == 3 && s2 <=15) || (s1 == 1 && s2 <= 31) || (s1 == 2 && s2 <= 31)){
            System.out.println("Winter");
        }
        else if((s1 == 3 && s2 >= 15 && s2 <= 31) || (s1 == 6 && s2 <=15) || (s1 == 4 && s2 <= 31) || (s1 == 5 && s2 <= 31)){
            System.out.println("Spring");
        }
        else if((s1 == 6 && s2 >= 16 && s2 <= 31) || (s1 == 9 && s2 <=15) || (s1 == 7 && s2 <= 31) || (s1 == 8 && s2 <= 31)){
            System.out.println("Summer");
        }
        else if((s1 == 9 && s2 >= 15 && s2 <= 31) || (s1 == 12 && s2 <=16) || (s1 == 10 && s2 <= 31) || (s1 == 11 && s2 <= 31)){
            System.out.println("Fall");
        }
        break;
   }
 }
}
        
          
        
