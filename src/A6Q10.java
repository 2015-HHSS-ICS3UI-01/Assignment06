
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

         int dashFound = first.indexOf("-");
           int dashFound2 = second.indexOf("-");
             int answer = dashFound - dashFound2;
               String first = pigLatin.substring(0, aFound);
            String last = pigLatin.substring(aFound);
           
             if(answer != 0){
                 return false;
             }
            return true;
            
           
    }
    
}
