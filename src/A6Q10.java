
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
  public static boolean sameDashes (String firw, String secw) {
        boolean words = false;
        int X10 = 0;
        String test = "";
        while (X10 < firw.length()) {
            test = firw.substring(X10, X10 + 1);
            if (!test.equals("-")) {
                firw = firw.substring(0, X10) + "0" + firw.substring(X10 + 1, firw.length());
            }
            X10 = X10 + 1;
        }
        X10 = 0;
        test = "";
        while (X10 <secw.length()) {
            test = secw.substring(X10, X10 + 1);
            if (!test.equals("-")) {
                secw = secw.substring(0, X10) + "0" + secw.substring(X10 + 1, secw.length());
            }
            X10 = X10 + 1;
        }
        if (firw.equals(secw)) {
            words = true;
            System.out.println("True");
        }
        return words;
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("input first word");
        String firw = input.nextLine();
        System.out.println("input second word");
        String secw = input.nextLine();
        boolean sameDashes = sameDashes (firw, secw);
}
}