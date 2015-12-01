
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A6Q10 {
    
    public static boolean samedashes(String string1, String string2){
        
     
        
        
    }
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new sacnner 
        Scanner input = new Scanner(System.in);
        //ask user to enter string 
        System.out.println("please a string ");
        //allow user to enter a string 
        String string1=input.nextLine();
        //ask user to enter another string 
        System.out.println("Please enter another string ");
        String string2=input.nextLine();
        //retunr anserws to the samedashes method 
       boolean finalstring =samedashes(string1,string2);
        
        
    }
}
