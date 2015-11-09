/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void examGrade(int perc) {
        if(perc<1){
            System.out.println("You got less then zero. You fail.");
        }else if(perc<50){
            System.out.println("You got an F.");
        }else if(perc<60){
            System.out.println("You got an D.");
        }else if(perc<70){
            System.out.println("You got an C.");
        }else if(perc<80){
            System.out.println("You got an B.");
        }else if(perc<101){
            System.out.println("You got an A.");
        }else if(perc>100){
            System.out.println("You got better than perfect you cheater.");
        }
    }
}
