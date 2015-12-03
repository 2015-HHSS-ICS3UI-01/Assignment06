
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author snowc4636
 */
public class A6Q5 {

    public static void chaotic(int sections) {
        for (int i = 0; i < sections; i++) {
            int randNum = (int) (Math.random() * (5)) + 1;
            //find the pattern
            for (int patterns = randNum; patterns >= 1; patterns--){
                //system print
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        // enter the amount of sections
        System.out.println(" Please enter the amount of sections");
        int sections = input.nextInt();
        // formula
        chaotic(sections);
    }
}
