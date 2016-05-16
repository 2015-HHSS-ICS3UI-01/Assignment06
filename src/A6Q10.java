/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q10 {

    public static boolean sameDashes(String s1, String s2) {//main method for this code

        boolean ans = true;//set true to the int ans
       
        
        int lengths1 = s1.length();//set an intiger to the length of both strings
        int lengths2 = s2.length();//set an intiger to the length of both strings

        int count = 1;//created a count variable 
        int start = 0;//created a start variable 

        if (lengths1 > lengths2) {//if the first string is longer then the second string
            count = lengths1;//set the length of string 1 to count
        } else {//if not
            count = lengths2;//set the length of string 2 to count
        }

        while (count != start) {//while count does not equal start 
            int dash1 = s1.indexOf("-");//find the dashes in the first word
            int dash2 = s2.indexOf("-");//find the dashes in the second word

            if (dash1 == -1 && dash2 == -1) {//check if both words do not contain dashes
                return ans;//return ans 
            } else {//if both strings do have - 
                if (dash1 == dash2) {//check if both dashes are in the same spot
                    s1 = s1.substring(dash1 + 1, lengths1);//cuts the string to where the dashes are in string 1
                    s2 = s2.substring(dash2 + 1, lengths2);//cuts the string to where the dashes are in string 2

                    lengths1 = lengths1 - (dash1 + 1);//update the length of the string now that we have removed letters initial length - letters removed
                    lengths2 = lengths2 - (dash1 + 1);//update the length of the string now that we have removed letters initial length - letters removed

                } else {//else if
                    return false;//return false
                }

            }
           
        }
 return ans;//return ans
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(sameDashes("he-ll-o", "pe-ople"));
        
    }
}
