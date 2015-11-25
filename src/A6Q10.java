
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A6Q10 {

    public static void sameDashes(String firstString) {

        //make a scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user to input the second string
        System.out.println("please the enter the second string.");

        //store the second string in a variable
        String secondString = input.nextLine();
        
        //find the location of all of the "-" in the first string
        int dash = firstString.indexOf("-");
        int dash2 =secondString.indexOf("-");
        System.out.println(dash);
        
        
        
        
        
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);

        //tell the user to enter the first string
        System.out.println("Please enter the first string.");

        //store the first string in a variable
        String firstString = input.nextLine();
        
        sameDashes (firstString);


    }
}
