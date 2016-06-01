
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A6Q9 {

    public static String allDigitsOdd(int num) {
        while (num > 9) {
            if (num % 10 == 1 || num % 10 == 3 || num % 10 == 5 || num % 10 == 7 || num % 10 == 9) {
                num = num / 10;
            }
            if (num % 10 == 2 || num % 10 == 4 || num % 10 == 6 || num % 10 == 8 || num % 10 == 0) {
                return "false";
            }
        }
        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 9) {
            return "true";
        }
        
        if (num == 2 || num == 4 || num == 6 || num == 8 || num == 0) {
            return "false";
        }
        return "";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String odd = allDigitsOdd(9535);
        System.out.println(odd);
    }
}
