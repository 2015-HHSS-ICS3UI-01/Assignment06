/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q9 {

    public static void allDigitsOdd(int num) {
        // convert to string
        String numString = Integer.toString(num);

        if (numString.contains("2") || numString.contains("4") || numString.contains("6") || numString.contains("8")) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        allDigitsOdd(9145293);
        allDigitsOdd(135319);
    }
}
