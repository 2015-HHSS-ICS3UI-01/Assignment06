/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question7 {
    //create function method, store integer in variable 'number'
    public static void firstDigit(int number) {
        //convert integer to string
        String num = Integer.toString(number);
        //check if number is negative
        if (num.startsWith("-")) {
            //start string 'finalNum' at 1 to skip the negative symbol
            String finalNum = (num.substring(1, 2));
            //output final number
            System.out.println(finalNum);
        } else {
            //create new string that stores the first character (number)
            String finalNum = (num.substring(0, 1));
            //output first number
            System.out.println(finalNum);
        }
    }

    public static void main(String[] args) {
        //send number to variable
        firstDigit(-524);
    }
}
