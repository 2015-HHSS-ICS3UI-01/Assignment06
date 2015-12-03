
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A6Q1 {
    //create function method to represent areaofcricle 
     public static double areaCircle(double r){
         //create a vraiable to represent the area 
        double area= Math.PI*r*r;
        //return the area 
        return area;
     }
    
    
    
    

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        //create new scanner 
         Scanner input = new Scanner(System.in);
          //ask user the redius of the cri cle 
         System.out.println("please enter the radius of the circle");
         //allowe user enter radius amount and store it in a varible 
         double radius= input.nextDouble();
         //create double and store the final answer in it 
         double answer= areaCircle(radius);
         //tell the user the area of the circle 
        System.out.println("The area of the circle is "+ answer);

    }  
}
