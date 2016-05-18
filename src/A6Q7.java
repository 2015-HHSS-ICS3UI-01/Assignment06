
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int digit) {

        int length = 0; // set length as 0, even though this variable is kind of useless except being used as a medium for "for" statement
        for (length = 0; digit > 9; length++) { //until the digit only has one digit(<10), keep dividing digit by 10 and add 1 to length each time
            digit = (digit / 10); //editing digit to be divided by 10
        }

        return digit; // return final digit(first digit)

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int firstDigit = firstDigit(5572);//enter digit 

        System.out.println(firstDigit);//print answer to test method
    }
}
