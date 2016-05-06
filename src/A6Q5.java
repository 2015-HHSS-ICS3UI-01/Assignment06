/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q5 {

    public static void Chaotic(int math) {

        // Generate a random amount of '*' between 1 and 5
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        // Print each number as a '*' 
        System.out.println("*");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chaotic(6);
    }
}
