
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
        for(int o = i; o > 0; o--){
        int e = (int)(Math.random()*5)+1;
        for(int f = e; f > 0; f--){
            System.out.print("*");
        }
            System.out.println();}
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number.");
        int n = input.nextInt();
        chaotic(n);
    }
}
