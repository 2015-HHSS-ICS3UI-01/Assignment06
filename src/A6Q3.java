
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A6Q3 {
    
    
    public static void factor(int number){
        //checking every number that is tless then "number"
        for (int n=1;n<=number;n++){
            //if the number can divide evernly then it is a factor 
            if(number% n==0){
                System.out.println("factors|("+number+")="+n);
            }
        }
        
    }
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scnner 
          Scanner input = new Scanner(System.in);
          //ask user to enter a number 
          System.out.println("please enter a number ");
          //allow user to enter number 
          int num=input.nextInt();
          factor(num);
          
          
          
                  
    }
}
