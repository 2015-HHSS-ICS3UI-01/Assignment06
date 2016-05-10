
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q10 {
    //method for 1st string

    public static String string1(String s1) {
        StringBuilder ans = new StringBuilder();
        //check every letter or number from beginning
        for (int i = 0; i < s1.length(); i++) {
            char s = s1.charAt(i);
            if (s == '-') {
                //save true if the letter or number is -
                ans.append("True");
            } else {
                //save false if the letter or number isn't -
                ans.append("False");
            }
        }
        return ans.toString();
    }
    //method for 2nd string

    public static String string2(String s2) {
        StringBuilder ans = new StringBuilder();
        //check every letter or number from beginning
        for (int i = 0; i < s2.length(); i++) {
            char s = s2.charAt(i);
            if (s == '-') {
                //save true if the letter or number is -
                ans.append("True");
            } else {
                //save false if the letter or number isn't -
                ans.append("False");
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask user to input string
            System.out.println("Please input String");
            String s1 = input.nextLine();
            //ask user to input another string
            System.out.println("Please input another String");
            String s2 = input.nextLine();
            //bring string 1 and string 2 method and set build new string out of it
            String string1 = string1(s1);
            String string2 = string2(s2);
            //compare string 1 and string 2 
            if (string1.equals(string2)) {
                //print our true if 2 strings are same
                System.out.println("True");
            } else {
                //print out false if 2 strings are different
                System.out.println("False");
            }
        }
    }
}
