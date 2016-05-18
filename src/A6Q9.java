
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static String allDigitsOdd(int num) {




        for (int length = String.valueOf(num).length(); length > 0; length--) { //find length of num
            //for variable length as length of num,
            //set num2 as specified digit to check odd/even

            double num2 = num % Math.pow(10, length); // find digit by dividing num by length, which goes down each loop

            //FOR FINDING EVEN/ODD OF DIGITS OTHER THAN 1ST
            if (num2 > 9) {//if num is not one digit
                //note: it's not rounding down, so it's never gunna be even
                num2 = (num2 / (Math.pow(10, length - 1)));//num2 divided by 10^length to remove digits behind
                num2 = Math.floor(num2);//round number down, to get rid of decimals

                if (num2 % 2 == 0) {// if the number has a even digit
                    return "false";//return false string  
                }

            } //FOR FINDING EVEN/ODD OF 1ST DIGIT
            else if (num2 < 10) {//if num is 1 digit
                if (num2 % 2 != 0) {//if number is odd

                    // return false string
                    if (length == 1) { // if numbers are all found to be odd, 
                        return "true"; //return true string
                    }
                } else if (num2 % 2 == 0) {// if the number has a even digit
                    return "false";//return false string

                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String bob = allDigitsOdd(1112);

        System.out.println(bob); // print returned statement
    }
}
