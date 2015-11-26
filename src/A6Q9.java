/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q9 {

    public static String allDigitsOdd(int number) {
        String trueFalse = "tF";
        if(number >  1) {
        int digits = number / 10;
        } else {
            if(number == 0 || number == 2 || number == 4 || number ==6 || number == 8){
                trueFalse = "False";
        } else {
                trueFalse = "True";
            }
        }
        System.out.println(trueFalse);
        return trueFalse;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        allDigitsOdd(4);
    }
}
