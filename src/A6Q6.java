/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(int digit) {// make integer method
        int lastDigit = digit % 10;//find remainder of number inputed divided by 10(which is last digit)
        if (lastDigit < 0) {// in case last digit is negative, multiply by negative to make it posative

            lastDigit = lastDigit * (-1);
        }
        return lastDigit;//return last digit
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int lastDigit = lastDigit(-3575);

        System.out.println(lastDigit);//print answer to test method
    }
}
