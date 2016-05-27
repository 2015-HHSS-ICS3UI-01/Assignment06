/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

/**
 *
 * @author fostp4040
 */
public class A6Q5 {
    public static void chaotic(int Num){
        for(int i=5; i>0; i--){
             int randNum=(int)(Math.random()*(5-1+1))+1;
             System.out.println('*');
             for(int lines=Num; lines>0; lines--){
                 lines=(int)(Math.random()*(5-1+1))+1;
                 System.out.print('*');
             }
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        chaotic(10);
    }
}
