


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question8 {
    //create method that takes 2 integers and assign them to the respective variables
    public static void season(int month, int day) {
        //if month is 1 or 2, season is definately winter
        if (month == 1 || month == 2) {
            System.out.println("Winter");
        //if the month is 3 and day is less than 16, its winter    
        } else if (month == 3 && day < 16) {
            System.out.println("Winter");
        //if month is 3 and day is greater than 16, its spring    
        } else if (month == 3) {
            System.out.println("Spring");
        //if day is more than 15 when month is 12 its winter    
        } else if (month == 12 && day > 15) {
            System.out.println("Winter");
        //day less than 15 means fall    
        } else if (month == 12) {
            System.out.println("Fall");
        //if month is 4 or 5, season is definately spring    
        } else if (month == 4 || month == 5) {
            System.out.println("Spring");
        //if month is 6 and day is 6 its spring    
        } else if (month == 6 && day < 16) {
            System.out.println("Spring");
        //if month is 6 and day is greater than 15, its summer    
        } else if (month == 6 && day > 15) {
            System.out.println("Summer");
        //if month is 7 or 8, season is definately summer    
        } else if (month == 7 || month == 8) {
            System.out.println("Summer");
        //if month is 9 and day is less than 16, it summer    
        } else if (month == 9 && day < 16) {
            System.out.println("Summer");
        //if month is 9 and day is greater than 16 its fall    
        } else {
            System.out.println("Fall");
        }
    }
    
    public static void main(String[] args) {
        //call on method, send 2 numbers representing month and date
        season(11,16);

    }
}
