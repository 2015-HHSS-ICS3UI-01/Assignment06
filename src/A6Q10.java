/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q10 {
    //boolean outputs true or false
    // String 1, String 2
    public static boolean sameDashes(String s1, String s2) {
        // get length
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        // counter variable
        int count = 1; // counter variable
        int start = 0; // variable start

        if (lengthS1 > lengthS2) { // compare lengths
            count = lengthS1;
        } else {
            count = lengthS2;
        }
        while (count != start) {
            //find where dash is in both strings
            int spot1 = s1.indexOf("-");
            int spot2 = s2.indexOf("-");
            if (spot1 == -1 && spot2 == -1) {
                return true; // return false if not at same spot
            } else if (spot1 == spot2) {
                //shorten string to where the first dash in each string was found
                s1 = s1.substring(spot1 + 1, lengthS1);
                s2 = s2.substring(spot2 + 1, lengthS2);
                lengthS1 = lengthS1 - (spot1 + 1);
                lengthS2 = lengthS2 - (spot2 + 1);
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sameDashes("cr-a-zy", "cr-a-z"));
        System.out.println(sameDashes("c-ra-zy", "cr-a-zy"));
    }
}
