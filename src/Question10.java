/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question10 {
//assign string 1 to string 1, assign string 2 to string2
//create boolean method that outputs true or false
    public static boolean sameDashes(String string1, String string2) {
        //get length of both strings, store them in respective variables
        int lengthStr1 = string1.length();
        int lengthStr2 = string2.length();
        //create counter variable(set as 1, does not matter, will be change later)
        int count = 1;
        //create variable "start", 0
        int start = 0;
        /*check which string is longer,
         then assign string length to count (longest word is needed)*/
        if (lengthStr1 > lengthStr2) {
            count = lengthStr1;
            //System.out.println("count is "+count);/*for test*/
        } else {
            count = lengthStr2;
            //System.out.println("count is "+count);/*for test*/
        }
        /*loop until the counter has expired
         (program has been looped as many times as string length, or true is returned*/
        while (count != start) {
            //find where dash is in both strings
            int spot1 = string1.indexOf("-");
            //System.out.println("spot1 is " + spot1);/*for test*/
            int spot2 = string2.indexOf("-");
            //System.out.println("spot2 is " + spot2);/*for test*/
            //check if both words dont contain dashes, if true, output true, else, move on
            if (spot1 == -1 && spot2 == -1) {
                return true;
                //check if both dashes at same spot, if not, return false
            } else if (spot1 == spot2) {
                //shorten string to where the first dash in each string was found
                string1 = string1.substring(spot1 + 1, lengthStr1);
                string2 = string2.substring(spot2 + 1, lengthStr2);
                //System.out.println(string1);/*for test*/
                //System.out.println(string2);/*for test*/
            /*update length of string now that it has been changed, (subtract number of
                 letters removed)*/
                lengthStr1 = lengthStr1 - (spot1 + 1);
                lengthStr2 = lengthStr2 - (spot2 + 1);
                //System.out.println("length str1 is "+ lengthStr1);/*for test*/
                //System.out.println("length str2 is "+ lengthStr2);/*for test*/
                //update counter, make "start" on higher than before
                start++;
                //System.out.println("start is "+start);/*for test*/
                //return false if dashed are not at the same spot    
            } else {
                return false;
            }
        }
        /*this is reached when all dashes were 
         in same place and counter is expired (output true)*/
        return true;
    }

    //main method
    public static void main(String[] args) {
        //call on method, send 2 strings , output true or false
        System.out.println(sameDashes("input-str2", "input-str1"));
    }
}
