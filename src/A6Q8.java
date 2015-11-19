
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A6Q8 {

    public static void season(int month, int day){
        if(month == 12 && day < 16 && month <= 3 && day < 15){
            System.out.println("season is winter");
            
        }
     
            }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("please enter month: ");
        int month = input.nextInt();
        System.out.print("please enter day: ");
        int day = input.nextInt();
        
        season(month, day);
        
        
        
    }
}
