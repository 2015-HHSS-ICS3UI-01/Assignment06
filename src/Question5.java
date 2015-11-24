
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question5 {

    public static void chaotic(int i){
        //There are the same amount of lines as the users inputed number.
        for(int o = i; o > 0; o--){
            //The program finds a number between 1 and 5 and prints that many stars
            //out on that line.
        int e = (int)(Math.random()*5)+1;
        for(int f = e; f > 0; f--){
            System.out.print("*");
        }
            System.out.println();}
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number.");
        //The user inputs an amount of lines that the program is going to use.
        int n = input.nextInt();
        //The method that creates the lines and stars is called chaotic and is called
        //upon here.
        chaotic(n);
    }
}
