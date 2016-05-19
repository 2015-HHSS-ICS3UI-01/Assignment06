
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static double Area (int X1){
      //where the formula is
      double ans = Math.PI*(X1*X1);
      return ans;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius");
        //entering the radius
        int X1 = input.nextInt();
        double Area = Area(X1);
        //printing out the variable
        System.out.println("the area is " + Area);
    }
}
