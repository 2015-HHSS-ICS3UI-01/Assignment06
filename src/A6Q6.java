/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A6Q6 {

    public static void lastDigit(int num) {         // creating the method
        if (num < 0) {                              // if the number is less then 0 do the following 
            num = num * -1;                         // take the number and multiply it by -1
        }
        int less = num % 10;                        // take the number and pull it apart 
        num = num / 10;                             // take the number and divide it by 10
        System.out.println(less);                   // ouput the last number
    }

    public static void main(String[] args) {
    
        lastDigit(10);                              // where you put the number you want to know the last number of 
    
    }
}
