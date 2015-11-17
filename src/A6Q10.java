
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter 2 desired phrases");
        String first = in.nextLine();
        String second = in.nextLine();
        
        boolean answer = sameDashes(first,second);
        System.out.println(answer);
        
    }
    public static boolean sameDashes(String first, String second){
        while(true){
         int dashFound = first.indexOf("-");
         int dashFound2 = second.indexOf("-");
          
               String first1 = first.substring(0, dashFound);
            String first2 = second.substring(0,dashFound2);
            
             int numChars = first1.length();
             int numChars2 = first2.length();
             
             
             first = first1.replace(first1, "");
             second = first2.replace(first2, "");

             int answer = (numChars2 - numChars);
           
             if(answer != 0){
                 return false;
             }
             if (numChars != 0 && numChars2 != 0){
                 return true;
             }
            return true;
            
        } 
    }
    
}
