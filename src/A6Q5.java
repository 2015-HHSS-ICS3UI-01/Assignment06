
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // generates scanner
        Scanner in = new Scanner(System.in);
        // Asks for number of lines
        System.out.println("Input number of lines ");
        int lines = in.nextInt();
        // executes the chaotic method
        chaotic(lines);
    }
    // The method for chaotic, this is known as a procedure method because it's void
    public static void chaotic(int lines) {
        // This loop counts up until it = #lines
        for (int i = 0; i < lines; i++) {
            // Equation Mr.Lamont composed to obtain a random integer of patterns
            int randNum = (int) (Math.random() * (5)) + 1;
            // This is is used to write patterns 
            for (int patterns = randNum; patterns >= 1; patterns--) {
                System.out.print("*");
            }// This prints the line completely and makes a new one
            System.out.println("");
        }
    }
}
