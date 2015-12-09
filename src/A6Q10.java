
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A6Q10 {
    //Create a method
    public static boolean sameDashes(String word1, String word2) {
        //make while loop to check for dashes
        while (true) { 
            //make integer for position of dashes
            int dash1 = word1.indexOf("-");
            int dash2 = word2.indexOf("-");
            
            //keep loop going until there is no more dashes
            if(dash2 == -1 && dash1 == -1){
                //return loop true if all dashes are in the same spot
                return true;
            }
            //remove words that come before the dashes
            if (dash1 == dash2) {
                word1 = word1.substring(dash1 + 1);
                word2 = word2.substring(dash2 + 1);
            } else {
             //return loop false if dashes are not in the same spot
                return false;
            }
        }
    }
    /**
     * }
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        
        //ask user for a word and store it
        System.out.println("Enter a word or number with a dash");
        String word1 = in.nextLine();
        //ask user for a word and storew it
        System.out.println("Enter another word or number with a dash");
        String word2 = in.nextLine();
        //run method
        System.out.println(sameDashes(word1, word2));
    }
}
