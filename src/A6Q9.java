/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q9 {

    public static void allDigitsOdd(int number) {//main method for this code

        String num = Integer.toString(number);//make intigier to string

        if (num.contains("2") || num.contains("4") || num.contains("6") || num.contains("8") || num.contains("0")) {//if the number has any even numbers
            System.out.println("False");//return false
        } else if (!num.contains("2") || !num.contains("4") || !num.contains("6") || !num.contains("8") || !num.contains("0")) {// if the num doesnt contain any evenm numbers
            System.out.println("True");//return true
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        allDigitsOdd(137795);//input number
    }
}
