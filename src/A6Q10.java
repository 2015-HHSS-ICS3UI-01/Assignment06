/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static String sameDashes(String str1, String str2) {
        //add stringbuilders for str1 and str2
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        //at start, if neither string has any dashes, both of them TECHNICALLY have dashes in the same spot, which is no spots
        if (sb1.indexOf("-") == -1 && sb2.indexOf("-") == -1) {
            return "true";
        }
        //if both strings have dashes, we are then able to continuously check positions of dashes
        while (sb1.indexOf("-") != -1 && sb2.indexOf("-") != -1) {


            //if both strings have dashes in the same place, delete the position from left to right of dash
            if (sb1.indexOf("-") == sb2.indexOf("-")) {

                //remove words up left to right up to first dash
                sb1.delete(0, sb1.indexOf("-") + 1);
                sb2.delete(0, sb2.indexOf("-") + 1);

            }
            //if the index's of the dashes do not match after deleting the previous matching ones, return false
            if (sb1.indexOf("-") == sb2.indexOf("-") == false) {
                return "false";
            }

            //if dashes are all compared(all dashes removed), and program hasn't returned false yet, all dashes match and we return true
            if (sb1.indexOf("-") == -1 && sb2.indexOf("-") == -1) {
                return "true";

            }

        }
        return "";//stub return to satisfy method
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String bob = sameDashes("criminal-plan", "(206)555-1384");
        System.out.println(bob);
    }
}
