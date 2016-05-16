/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A6Q10 {

    public static boolean sameDashes(String a, String b) {      // creating the method with 2 strings

        boolean ans = true;             // setting up so a return statement can be made 

        int add = 1;                    // counting by one each time                       
        int begin = 0;                  // the initial start of the count 

        int L1 = a.length();            // finding the length of the first string 
        int L2 = b.length();            // finding the length of the second string 

        if (L1 > L2) {                  // if string a is longer then string b do the following 
            add = L1;                   // int add equals length of string a
        } else {
            add = L2;                   // if that does work add will equal the length of string b 
        }

        while (add != begin) {          // while the value of int add doesn't equal the value of int begin do the following 
            int D1 = a.indexOf("-");    // int D1 will look for the start of the word and if its a dash 
            int D2 = b.indexOf("-");    // int D2 will look for the start of the word and if its a dash 


            if (D1 == -1 && D2 == -1) {     // if neither of those are true do the following 
                return true;                // return true to the user 
            } else {                        
                if (D1 == D2) {             // if they both equal do the following 
                    a = a.substring(D1 + 1, L1);    // chops up the string until the first dash is found
                    b = b.substring(D2 + 1, L2);    // chops up the string until the first dash is found

                    L1 = L1 - (D1 + 1);     // getting the new length of the string after letters removed 
                    L2 = L2 - (D2 + 1);     // getting the new length of the string after letters removed

                } else {
                    return false;           // otherwise return false to the user 
                }

                return true;                // return true to the user 

            }

        }
        return ans;                         // return statement 
    }

    public static void main(String[] args) {

        System.out.println(sameDashes("H-ello","Wor-ld"));      // instert the two strings that will be told of the dashes       
        
    }
}