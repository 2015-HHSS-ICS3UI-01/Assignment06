/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q7 {

    public static void firstDigit(int num) {
        if (num < 0) {//if the number inputted is less then 0
            num = num * -1;//multiply it by -1 to make it positive
        }
        String stringnum = Integer.toString(num);//convert integer num to stringnum 
        String firstNum = (stringnum.substring(0, 1));//cut the string up and focus on just the first character
        System.out.println(firstNum);//outpring 0, 1 or the first number
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        firstDigit(-8362826);
    }
}
