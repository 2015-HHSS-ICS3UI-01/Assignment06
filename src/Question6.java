/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question6 {
//create function method, store integer in variable 'number'
public static void firstDigit(int number){
    //convert integer to string
    String num = Integer.toString(number);
    //store length of number(string)in variable
    int lengthNum = num.length();
    //cut length of number by one
    int lengthCut = lengthNum - 1;
    //create new string starting st lengthCut and ending at lengthNum, this will store one character(number)
    String finalNum = (num.substring(lengthCut, lengthNum));
    //output number to screen
    System.out.println(finalNum);
}
    
    
    
    public static void main(String[] args) {

        //send number to method 'firstDigit'
        firstDigit(55);
        
        
    }
}
