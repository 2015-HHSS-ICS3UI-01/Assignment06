
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A6Q8 {
    //create method
public static void Season(int month, int day){
    //make if statement for days in winter
    if (month == 12 && day >= 16){
       System.out.println("It is Winter");
    }else
    if (month <= 3 && day <= 15){
        System.out.println("It is Winter");
    }else
    //make if statement for days in spring
    if ( month >= 3 && day >= 16){
        System.out.println("It is Spring");
    }else
    if (month <= 6 && day <= 15){
        System.out.println("It is Spring");
    }else
    //make if statement for days in summer
    if (month >= 6 && day >= 16){
        System.out.println("It is Summer");
    }else
    if(month <= 9 && day <= 15){
        System.out.println("It is Summer");
    }else
     //make if statement for days in fall
    if (month >= 9 && day >= 16 ){
        System.out.println("It is Fall");
    }else
    if(month <= 12 && day <= 15){
     System.out.println("It is Fall");
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //make new scanner
       Scanner in = new Scanner(System.in);
       
       //ask user for month
        System.out.println("What month is it?");
        int month = in.nextInt();
        //ask user for day
        System.out.println("What day is it");
        int day = in.nextInt(); 
        //run method
        Season(month,day);
    }
}
