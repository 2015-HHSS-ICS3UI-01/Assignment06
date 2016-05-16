/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q6 {

    public static void lastDigit(int num) {//main method for this code
        if (num < 0) {//if the number inputed is less then 0
            num = num * -1;//multiply the number by -1 to make it positive
        }
        int last = num % 10;//break the number apart using the next two lines and assign the last digit to int last
        num = num / 10;
        System.out.println(last);//print out the last digit

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        lastDigit(-823647);
    }
}
