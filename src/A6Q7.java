/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q7 {

    public static void firstDigit(int num) {
        // check if number is negative
        if (num < 0) {
            num = num * -1;
        }
        // convert to string
        String numString = Integer.toString(num);
        // store first char
        String firstNum = (numString.substring(0, 1));
        // output first num
        System.out.println(firstNum);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        firstDigit(-987);
    }
}
