
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines of pattern: ");
        int lines = input.nextInt();
        chaotic(lines);
        input.close();
    }
    public static void chaotic(int lines) {
        while(lines > 0){
            int randomNumber = (int)(Math.random() * (5 - 1 + 1)) + 1;
            if(randomNumber == 1){
                System.out.println("*");
            } else if(randomNumber == 2){
                System.out.println("**");
            } else if(randomNumber == 3){
                System.out.println("***");
            } else if(randomNumber == 4){
                System.out.println("****");
            } else{
                System.out.println("*****");
            }
            lines = lines - 1;
        }
    }
}
