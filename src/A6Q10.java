
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q10 {

    public static boolean sameDashes(String a, String b) {
        boolean ado = false;                                                    //boolean to return
        int x = 0;                                                              //int x is used to compare successive places in the string
        String test = "";                                                       //string to test a certain position in string
        while (x < a.length()) {
            test = a.substring(x, x + 1);                                       //test becomes position x of a
            if (!test.equals("-")) {                                            //if position x is not a -
                a = a.substring(0, x) + "0" + a.substring(x + 1, a.length());   //position x is replaced with a 0
            }
            x = x + 1;                                                          //transfers to next position                        
        }
        x = 0;                                                                  //resets x and test
        test = "";
        while (x < b.length()) {                                                //exact same steps for a as b
            test = b.substring(x, x + 1);
            if (!test.equals("-")) {
                b = b.substring(0, x) + "0" + b.substring(x + 1, b.length());
            }
            x = x + 1;
        }
        if (a.equals(b)) {                                                      //if a = b
            ado = true;                                                         //then the dashes are in the same place
        }
        return ado;                                                             //returns boolean
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                  //Create Scanner
        System.out.println("Input string one");                                  //Asks to input number
        String a = input.nextLine();                                             //recieves string
        System.out.println("Input string two");                                  //Asks to input number
        String b = input.nextLine();                                             //recieves string
        System.out.println(sameDashes(a, b));                                    //prints answer
    }
}
