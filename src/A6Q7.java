


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A6Q7 {

    public static int firstDigit(int num){
        int first = num/10;
        while(first > 9){
            first = first/10;
        }
        return first;        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first = firstDigit(35686);
        System.out.println(first);
    }
}
