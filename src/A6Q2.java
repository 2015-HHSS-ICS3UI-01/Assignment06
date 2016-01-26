
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A6Q2 {
    
 //create method   
public static void examgrade(double grade) {
   //If grade is less then 50 make it an F
   if(grade <50){
       System.out.println("Your grade is a F");
   }
  //If grade is less then 59 make it an D
  if(grade >= 50 && grade <= 59){
      System.out.println("Your grade is a D");
  }
  //If grade is less then 69 make it an C
  if(grade >= 60 && grade <= 69){
      System.out.println("Your grade is a C");
  }
  //If grade is less then 79 make it an B
  if (grade >= 70 && grade <= 79){
      System.out.println("Your grade is a B");
  }
  //If grade is over an 80 make it an A
  if (grade >= 80){
      System.out.println("Your grade is an A");
  }

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner
       Scanner input = new Scanner(System.in);
       
       //ask for the exam percentage
        System.out.println("What was your percentage on the exam?");
        double grade = input.nextInt();
        //run method
        examgrade(grade);
        
       
    }
}
