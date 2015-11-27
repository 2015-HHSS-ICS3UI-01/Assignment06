
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static boolean sameDashes(String strn1, String strn2){
        boolean same = true;
        while(strn1.length()>0
                && strn2.length()>0){
            if(strn1.startsWith("-")
                    || strn2.startsWith("-")){
                if(strn1.startsWith("-")
                        && strn2.startsWith("-")){
                    
                }else{
                    same = false;
                }
            }
            strn1 = strn1.substring(1);
            strn2 = strn2.substring(1);
        }
        if(strn1.length()>0){
            while(strn1.length()>0){
                if(strn1.startsWith("-")){
                    same = false;
                }
                strn1 = strn1.substring(1);
            }
        }
        if(strn2.length()>0){
            while(strn2.length()>0){
                if(strn2.startsWith("-")){
                    same = false;
                }
                strn2 = strn2.substring(1);
            }
        }
        return same;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1.");
        String strn1 = input.nextLine();
        System.out.println("Enter string 2.");
        String strn2 = input.nextLine();
        boolean same = sameDashes(strn1,strn2);
        if(same){
            System.out.println("The dashes were in the same spot.");
        }else{
            System.out.println("The dashes were not in the same spot.");
        }
    }
}
