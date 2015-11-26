/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q10 {

    public static String sameDashes(String string1, String string2) {
        int dashes = string1.indexOf("-");
        int dashes2 = string2.indexOf("-");

        if (dashes == dashes2) {
            System.out.println("True");
            return "True";
        } else {
            System.out.println("False");
            return "False";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        sameDashes("abc", "9.8");
    }
}
