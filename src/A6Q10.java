
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

    public static void sameDashes(String firstString, String secondString) {



        //find the location of all of the "-" in the first string
        while (true) {


            //determine the loctaion of the first dash in both strings   
            int dash = firstString.indexOf("-");
            int dash2 = secondString.indexOf("-");

            //if the dashes are in the same location    
            if (dash == dash2) {

                //cut off the string from the start to the dashes   
                firstString = firstString.substring(0, dash + 1);
                secondString = secondString.substring(0, dash2 + 1);

                //if no other dashes can be found tell user it is true
                if (dash == -1 && dash2 == -1) {
                    System.out.println("True.");
                    break;
                }

                //if the dashes are not in the same location    
            } else if (dash != dash2) {
                System.out.println("False.");

                break;

            }
        }

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

        //ask the user to input the second string
        System.out.println("Please the enter the second string.");

        //store the second string in a variable
        String secondString = input.nextLine();

        //activate the method
        sameDashes(firstString, secondString);

        //close the scanner
        input.close();


    }
}
