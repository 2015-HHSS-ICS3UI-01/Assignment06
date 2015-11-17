/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A6Q5 {

    public static void chaotic(int total) {
        
        for (int i = 0; i < total; i = i + 1) {
            int randomNumber = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //prints out random number of "*" and goes to next line
            for (int s = 0; s < randomNumber; s = s + 1) {
                System.out.print("*");
            }
            //prints out to next line
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //prints out the number of lines entered in the brackets
        chaotic(4);
    }
}
