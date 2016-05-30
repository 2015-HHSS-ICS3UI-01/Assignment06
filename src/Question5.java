
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question5 {
    //create a method to generate a random number between 1-5, for the number that is generated the same amount of stars will be created

    public static void chaotic(int lines) {
        int count = 1;
        while (count <= lines) {
            int randNum = (int) (Math.random() * (5)) + 1;
            if (randNum == 1) {
                System.out.println("*");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if (randNum == 5) {
                System.out.println("*****");
            }
            count = count + 1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input and store the number of lines of stars you wish to see outputed
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of lines you would like");
        int lines = input.nextInt();
        //insert the number of lines into the method
        chaotic(lines);

    }
}
