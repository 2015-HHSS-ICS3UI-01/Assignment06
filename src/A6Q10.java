
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A6Q10 {

    public static void sameDashes(String firstWord, String secondWord) {
       
            //length of first word
            int firstLength = firstWord.length();
            int secondLength = secondWord.length();

            if (firstLength == secondLength) {
                // Counting loop, starts at 0
                for (int loopCount = 0; loopCount < firstLength; loopCount++) {

                    //takes the character from the number position
                    char firstOne = firstWord.charAt(loopCount);
                    char secondOne = secondWord.charAt(loopCount);

                    // if the character in the first word has a dash but the second string doesn't, print false
                    if (secondOne != '-' && firstOne == '-' || secondOne == '-' && firstOne != '-') {
                        System.out.println("False");
                        break;
                    }


                }
            }

            //if the second word's length is shorter than the first, check if it contains dashes, if it does, false, else true
            if (secondLength > firstLength) {

                secondWord = secondWord.substring(firstLength);
                if (secondWord.contains("-")) {
                    System.out.println("False");
                  
                } else {
                    System.out.println("True");
                  
                }

            }

            //if the first word's length is shorter than the second, check if it contains dashes, if it does, false, else true
            if (firstLength > secondLength) {

                firstWord = firstWord.substring(secondLength);
                if (firstWord.contains("-")) {
                    System.out.println("False");
               
                } else {
                    System.out.println("True");
                  
                }

            }


        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make the scanner
        Scanner input = new Scanner(System.in);

        //ask the user for the first word
        System.out.println("Enter a word.");
        String firstWord = input.nextLine();

        //ask user for the second word
        System.out.println("Enter a word that you want to check to see if dashes in the word are in the same place as the first word.");
        String secondWord = input.nextLine();

        //run the method
        sameDashes(firstWord, secondWord);
    }
}
