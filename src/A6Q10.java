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

    public static String sameDashes(String s1, String s2) {
        //create variables to save the places to compare
        int place = 0;
        //run through all the places in the string in a loop
        while ((s1.length() > place) && (s2.length() > place)) {
            //if the spot in the first string has a dash but the second one doesnt -return false
            if (s1.charAt(place) == '-' && s2.charAt(place) != '-') {
                return "false";
              //if th spot in the second string has a dash but the first doesnt -return false
            } else if (s1.charAt(place) != '-' && s2.charAt(place) == '-') {
                return "false";
            }
            //check the next spot
            place++;
        }
        return "true";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the method
        //enter two strings
        System.out.println(sameDashes("-abc--", "-9.8--ytfg"));
    }
}