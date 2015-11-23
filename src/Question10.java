
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
    
    public static void sameDashes(String string1, String string2){
        int time = 0;
        int time2 = 1;
        int length = string1.length();
        int length2 = string2.length();
        while (time <= length || time <= length2){
            String sub1 = string1.substring(time, time2);
            String sub2 = string2.substring(time, time2);
            time = time + 1;
            time2 = time2 + 1;
            if (sub1.equalsIgnoreCase("-") && !sub2.equalsIgnoreCase("-") || !sub1.equalsIgnoreCase("-") && sub2.equalsIgnoreCase("-")){
                System.out.println("False");
                break;
            }
            
        }
        if (time > length){
            System.out.println("True");
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
