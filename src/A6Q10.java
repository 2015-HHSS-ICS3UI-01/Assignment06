/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q10 {
    //method that compares the places of dashes

    public static String sameDashes(String string1, String string2) {
        //variable that stores the places of dashes in the first word
        int dashes = string1.indexOf("-");
        //variable that stores the places of dashes in the second word
        int dashes2 = string2.indexOf("-");

        //if the places of the dashes are the same print out true
        while (dashes == dashes2) {
            System.out.println("True");
            return "True";
            
        } // if the places of the dashes are not the same print out false
        if (dashes != dashes) {
            System.out.println("False");
            return "False";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the method
        //enter two strings
        sameDashes("abc--", "9.8-gz-");
    }
}
