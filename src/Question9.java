/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question9 {
    //create method allDigitsOdd thhat will return true or false

    public static boolean allDigitsOdd(int number) {
        //loop until break
        while (true) {
            //store last digit of number in a variable using mod
            int lastNum = number % 10;
            System.out.println(lastNum);
            //check if last digit is odd, if it is, remove digit by dividing by 10
            if (lastNum == 1 || lastNum == 3 || lastNum == 5 || lastNum == 7 || lastNum == 9) {
                //remove last digit
                number = number / 10;
            }
            //check if last digit is even, if it is, return false
            if (lastNum == 2 || lastNum == 4 || lastNum == 6 || lastNum == 8) {
                //return false
                return false;
            }
            //if last number is 0 (last number ghas been reached),break loop
            if (lastNum == 0) {
                break;
            }
        }
        //if program has reached this point all numbers are odd so return true
        return true;
    }

    public static void main(String[] args) {
        //output true or false while also sending number to method
        System.out.println(allDigitsOdd(135));


    }
}
