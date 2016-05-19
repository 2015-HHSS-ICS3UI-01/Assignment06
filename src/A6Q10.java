
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean sameDashes (String a, String b) {
        boolean abc = false;
        int i = 0;
        String test = "";
        while (i < a.length()) {
            test = a.substring(i, i + 1);
            if (!test.equals("-")) {
                a = a.substring(0, i) + "0" + a.substring(i + 1, a.length());
            }
            i = i + 1;
        }
        i = 0;
        test = "";
        while (i <b.length()) {
            test = b.substring(i, i + 1);
            if (!test.equals("-")) {
                b = b.substring(0, i) + "0" + b.substring(i + 1, b.length());
            }
            i = i + 1;
        }
        if (a.equals(b)) {
            abc = true;
            System.out.println("True");
        }
        return abc;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("input first word");
        String a = input.nextLine();
        System.out.println("input second word");
        String b = input.nextLine();
        boolean sameDashes = sameDashes(a, b);
        
    }
}
