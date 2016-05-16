
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A6Q5 {

    public static void chaotic(int nimp) {                          // creating the method
        for (int num = 0; num < nimp; num = num + 1) {              // if you have these things do the following 
            int rnum = (int) (Math.random() * (5 - 1 + 1)) + 1;     // can go up to 1 or 5 variables 

            if (rnum == 1) {            // if rnum = 1 output one asterisk                                        
                System.out.println("*");
            }
            if (rnum == 2) {            // if rnum = 2 output two asterisks                    
                System.out.println("**");
            }
            if (rnum == 3) {            // if rnum = 3 output three asterisks        
                System.out.println("***");
            }
            if (rnum == 4) {            // if rnum = 4 output four asterisks        
                System.out.println("****");
            }
            if (rnum == 5) {            // if rnum = 5 output five asterisks        
                System.out.println("*****");
            }
        }
    }

    public static void main(String[] args) {

        chaotic(6);         // where the user enters the number of lines of asterisks

    }
}