
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question10 {

    public static sameDashes(String string1, String string2){
        int time = 0;
        int length = string1.length();
        while (time >= length){
            int first = string1.indexOf("-");
            int first2 = string2.indexOf("-");
            ;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 words that are the same length");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        sameDashes(word1, word2);
    }
}
