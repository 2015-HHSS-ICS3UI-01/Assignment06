
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q2 {
    
    public static void grade (int grade){
        if (grade > 80){
            System.out.println("A");
        }else if (grade >= 70 && grade <= 79){
            System.out.println("B");
        }else if (grade >= 60 && grade <= 69){
            System.out.println("C");
        }else if (grade >= 50 && grade <= 59){
            System.out.println("D");
        }else{ System.out.println("F");   
    
    }}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in); 
    
    System.out.println("Enter your grade percentage.");
    
    int mark = input.nextInt();
    
    grade (mark);
    
    input.close();
    }
}
