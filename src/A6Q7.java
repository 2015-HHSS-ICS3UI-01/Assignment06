/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q7 {
    public static int firstDigit(int number) {
        int first = number;
        if(number >= 0)
            first = number / 10;
        if(number < 0){
            first = number / 10 * -1;
        }
        System.out.println(first);
        return first;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        firstDigit(56); 
    }
}
