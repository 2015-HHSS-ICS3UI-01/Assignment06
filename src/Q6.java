
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q6 {
    
    public static void lastDigit(int last){
        while(last>0&&last<0){
            
            if(last<0&&last<-10){
                break;
            
            }else if(last>0&&last<10){
            break;
            
            }else if(last>10){
                last = last/10;
            
            }else if(last<-10){
                last = last*10;
            }
        }
         
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int last = input.nextInt();
        lastDigit(last);

    }
}
