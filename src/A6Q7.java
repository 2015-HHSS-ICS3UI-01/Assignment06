

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static int lastdigit (int X6){
        int fd = X6;
        if (fd < 0 ){
         fd = fd*-1;
        } 
        while (fd > 10){
            fd = fd/10;
        }
        System.out.println("the first digit is " + fd);
        return fd;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       while (true){
        System.out.println("input number");
        int X6 = input.nextInt();
        int lastdigit = lastdigit(X6);
    }
}
}