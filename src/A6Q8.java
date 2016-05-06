/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q8 {

    public static void season(int month) {
        int day = input.nextInt();
        if (month >= 3 || month <= 6 || day <= 16 || day <= 15) {
            System.out.println("It is Sprin!");
        } else if (month >= 6 || month <= 9 || day <= 16 || day <= 15) {
            System.out.println("It is Summer!");
        } else if (month >= 9 || month <= 12 || day <= 16 || day <= 15) {
            System.out.println("It is Fall!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //season()
    }
}
