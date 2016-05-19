/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    
    public static void chaotic(int nimp) {
        for (int num = 0; num < nimp; num = num + 1) {
            int rnum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            if( rnum == 1) {
                System.out.println("*");
            }
            if (rnum == 2) {
                System.out.println("**");
            }
            if (rnum == 3) {
                System.out.println("***");
            }
            if (rnum == 4) {
                System.out.println("****");
            }
            if (rnum == 5) {
                System.out.println("*****");
            }
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        chaotic(7);
    }
}
