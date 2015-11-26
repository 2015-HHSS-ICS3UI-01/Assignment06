
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q10 {
    public static void sameDashes(String one, String two){
        if(one.equals(two)){
            System.out.println("True");
    }else{
            System.out.println("False");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line with dashes");
        String one = input.nextLine();
        System.out.println("Enter another line with dashes");
        String two = input.nextLine();
        sameDashes(one,two);
    }
}
