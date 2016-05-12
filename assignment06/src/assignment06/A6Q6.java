/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

/**
 *
 * @author fostp4040
 */
public class A6Q6 {
    public static void lastDigit(int num){
        if(num>0){
            int lastDigit=num%10;
            System.out.println(lastDigit);
        }else if(num<0){
            int lastDigit=num*-1%10;
            System.out.println(lastDigit);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lastDigit(-3527);
    }
}
