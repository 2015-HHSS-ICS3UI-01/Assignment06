/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q7 {
    public static void firstDigit(int first){
        while(first>0&&first<0){
            
            if(first<0&&first<-10){
                break;
            
            }else if(first>0&&first<10){
            break;
            
            }else if(first>10){
                first = first/10;
            
            }else if(first<-10){
                first = first*10;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
