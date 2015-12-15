
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q5 {

    public static void chaotic(int line) {
        while (line > 0) {
            //Generates random number
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //Creates random number of astericks
            for (int numS = 0; numS < randNum; numS++) {
                System.out.print("*");
            }
            //Prints them out on random generated lines
            System.out.println("");
            line--;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number (amount of lines)");
        //User inputs number
        int line = input.nextInt();
        //Uses the 'chaotic' method on number
        chaotic(line);

    }
}
