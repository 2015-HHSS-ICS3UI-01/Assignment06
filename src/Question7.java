/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created an integer called answer and made is equal to the
        //firstDigit method with the number 3572
        int answer = firstDigit(3572);
        //prints answer onto the screen
        System.out.println(answer);
    }
//created a method called firstDigit that uses one integer
    public static int firstDigit(int number) {
      //if number is less than 0, the following commands will be executed
        if (number < 0) {
            //created an integer called positive and made it equal to number
            //divided by -1
            int positive = number / -1;
            //created an integer called result and made it equal to positive
            //divided by 10
            int result = positive / 10;
            //while result in more than or equal to 10, the following commands
            //will be executed
            while (result >= 10) {
                result = result / 10;
            }
            //returns result to the main method
            return result;
//if the if statement before is false, than these following 
//commands will be executed
        } else {
            //created an integer called result and made it equal to number
            //divided by 10
            int result = number / 10;
            //while result is more than or equal to 10, the following 
            //commands will be executed
            while(result >= 10){
                result = result / 10;
            }
            //returns result to the main method
            return result;

        }

    }
}
