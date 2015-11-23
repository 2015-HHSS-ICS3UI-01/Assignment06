
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A6Q2 {
    
    
    
    

    
    
    //create  methode that allows
    public static void examgrade (int mark){
        //if the mark is then then 50 then there mark is a f
        if(mark<50){
            System.out.println("Your mark is F");
            //if the mark entered is less tha
        } if(mark>=50 && mark<60){
            System.out.println("Your mark is D");
        } if(mark>=60 && mark<70){
            System.out.println("your mark is C");
         } if(mark>=70 && mark<80){
             System.out.println("Your mark is B");
         } if(mark>=80 && mark<101)
             System.out.println("Your mark is A");
    }
        
         
    
    
    
    
   /**
 * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner 
         Scanner input = new Scanner(System.in);
         //ask user their grade 
         System.out.println("Whats numerical grade did you get on the test");
         int mark=input.nextInt();
         
         examgrade (mark);
         
      
         
        
   
        
    }

        
    }

