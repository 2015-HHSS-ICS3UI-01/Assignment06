
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q8 {

    public static void season(int month, int day) {
        if(month==12&&day==16||month==1||month==2||month==3&&day==15){
            System.out.println("Winter");
        }else if(month==3&&day==16||month==4||month==5||month==6&&day==15){
            System.out.println("Spring");
        }else if(month==6&&day==16||month==7||month==8||month==9&&day==15){
            System.out.println("Summer");
        }else if(month==9&&day==16||month==10||month==11||month==12&&day==15){
            System.out.println("Fall");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What month is it?");
        int month = input.nextInt();
        System.out.println("What day of the month is it?");
        int day = input.nextInt();
        
        System.out.println("The Season is: ");
        season(month,day);
    }
}
