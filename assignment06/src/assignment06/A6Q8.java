/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

/**
 *
 * @author fostp4040
 */
public class A6Q8 {
    public static void seasons(int month, int day){
        
        if(month==1&&day>=1||month==3&&day<=15){
            System.out.println("winter");
        }else if(month==3&&day>=16||month==6&&day<=15){
            System.out.println("spring");
        }else if(month==6&&day>=16||month==9&&day<=15){
            System.out.println("summer");
        }else if(month==9&&day>=16||month==12&&day<=15){
            System.out.println("fall");
        }else if(month==12&&day>=16||month==12&&day<=31){
            System.out.println("winter");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        seasons(12,16);
    }
}
