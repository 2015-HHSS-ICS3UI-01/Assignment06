/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q6 {
    public static int lastDigit(int number){
        int last = number;
        if(number >= 0)
            last = number % 10;
        if(number < 0) 
            last = number % 10 * -1;
        
        System.out.println(last);
        return last;
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        lastDigit(-7894);
    } 
}
