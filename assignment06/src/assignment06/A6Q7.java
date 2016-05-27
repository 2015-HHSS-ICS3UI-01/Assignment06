/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

/**
 *
 * @author fostp4040
 */
public class A6Q7 {
public static void firstDigit(int num){
        if(num>0){
            if(num>10&&num<100){
                int firstDigit=num/10;
                System.out.println(firstDigit);
            }else if(num>100){
                int firstDigit=num/100;
                System.out.println(firstDigit);
            }
        }else if(num<0){
            if(num<-10&&num>-100){
                int firstDigit=num/10;
                System.out.println(firstDigit);
            }else if(num<-100){
                int firstDigit=num*-1/100;
                System.out.println(firstDigit);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        firstDigit(-527);
    }
}
