
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class QuestionTen {

    public static void sameDashes(String phrase, String phrase2){
        int dashes = phrase.indexOf("-");
        int dashes2 = phrase2.indexOf("-");
        if(dashes == dashes2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase with dashes included");
        String phrase = input.nextLine();
        System.out.println("Please enter a different phrase with dashes included");
        String phrase2 = input.nextLine();
        sameDashes(phrase, phrase2);
    }
}
