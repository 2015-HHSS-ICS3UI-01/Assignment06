/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q10 {
    // String 1, String 2

    public static void sameDashes(String s1, String s2) {
        // String 1
        StringBuilder sBuilder1 = new StringBuilder(s1);
        // String 2
        StringBuilder sBuilder2 = new StringBuilder(s2);
        for (int i = 0; i < sBuilder1.length(); i++) {
            if (sBuilder1.charAt(i) == '-' && sBuilder2.charAt(i) == '-') {
                System.out.println("True");
            } else if (sBuilder1.charAt(i) != '-' && sBuilder2.charAt(i) != '-') {
                System.out.println("False.");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sameDashes("cr-a-zy", "bd-a-y");
    }
}
