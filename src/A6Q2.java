


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A6Q2 {

    public static void examGrade(int percent){
        if(percent < 50){
            System.out.println("F");
        }
        if(percent >= 50 && percent <= 59){
            System.out.println("D");
        }
        if(percent >= 60 && percent <= 69){
            System.out.println("C");
        }
        if(percent >= 70 && percent <= 79){
            System.out.println("B");
        }
        if(percent >= 80){
            System.out.println("A");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        examGrade(67);
    }
}
