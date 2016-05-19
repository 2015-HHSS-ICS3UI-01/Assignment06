
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    
    public static int allDigitsOdd (int number) {
        
        String num = Integer.toString(number);
        
        if (number < 0){
            number = number*-1;
        }
        
        if (num.contains("0") || num.contains("2") || num.contains("4") || num.contains("6") || num.contains("8") ){
            System.out.println("False");
        } else {
            if (num.contains("1") || num.contains("3") || num.contains("5") || num.contains("7") || num.contains("9")){
                System.out.println("True");
            }
        }
        return number;
    }
            
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        while(true){
        System.out.println("Please insert a number.");
        int n = input.nextInt();
        int allDigitsOdd = allDigitsOdd(n);
        }
    }
}
