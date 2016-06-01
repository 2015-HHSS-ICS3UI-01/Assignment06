

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A6Q6 {

    public static int lastDigit(int num){
        int r = num%10;
        if(num < 0){
           r = r*-1;
        }
        return r;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r = lastDigit(-74);
        System.out.println(r);
    }
}
