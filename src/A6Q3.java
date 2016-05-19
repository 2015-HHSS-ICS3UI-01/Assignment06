

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static double factor (int X3){
      int n = 1;
      int m = X3;
        
      while (n<=m){
          if (m % n == 0){
              System.out.println(n + " is a factor");
          }
          n++;
      }
    return n;
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         System.out.println("give an integer");
         int X3 = input.nextInt();
         double factor = factor (X3);
        
}
}