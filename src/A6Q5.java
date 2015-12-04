
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A6Q5 {

    public static void chaotic(int lines) {
        
        //generate the number of lines
      for(int loop = lines; lines > 0; lines--){
        int randNum = (int) (Math.random() * (5)) + 1;
        for(randNum = randNum; randNum > 0; randNum--){
            System.out.print("*");
        }
          System.out.println();
      }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make the scanner
        Scanner input = new Scanner(System.in);

        //ask the user for the amount of lines they'd like to generate
        System.out.println("Enter the number of lines you wish to generate.");
        int lines = input.nextInt();

        //run the procedure
        chaotic(lines);

        System.out.println("Great pattern broooooo.");



    }
}
