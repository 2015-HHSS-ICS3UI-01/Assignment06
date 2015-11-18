
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question3 {

public static void factor(int i){
    for (int e = i; e > 0; e--){
        int remainder = i%e;
        if (remainder == 0){
            int number = i/e;
            System.out.print(number + ", ");}
        }
            }
    

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number to factor.");
        int factor = input.nextInt();
        factor(factor);
        
    }
}
