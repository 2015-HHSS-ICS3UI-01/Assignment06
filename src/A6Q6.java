/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q6 {

    public static void lastDigit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int endnum = num % 10;
        num = num / 10;
        System.out.println(endnum);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lastDigit(-678);
    }
}
