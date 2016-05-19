
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static int Examgrade(int X2){ 
   //determining your grade from the percentage
    if (X2 < 50){
        System.out.println("your grade is F");
        
    }
       else if (50<= X2 && X2 <= 59){
        System.out.println("your grade is D");   
        
    }  else if (60<= X2 && X2 <= 69){
        System.out.println("your grade is C");   
        
    }  else if (70<= X2 && X2 <= 79){
        System.out.println("your grade is B");   
        
    }  else if (80<= X2 && X2 <= 100){
        System.out.println("your grade is A");   
       
    }
    return X2;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("enter grade");
        //entering the grade
        int X2 = input.nextInt();
        int Examgrade = Examgrade(X2);
        
    }
}
