/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created an integer called answer and made it equal to the
        //lastDigit method with the number 3572
        int answer = lastDigit(3572);
        //prints out answer onto the screen
        System.out.println(answer);
        
    }
    
    //created a method called lastDigit that uses one integer
    public static int lastDigit(int number){
        //if number is less than 0, then the following commands will be executed
        if(number <0){
            //created an integer named positive and made it equal to number
            //divided by -1
        int positive = number/-1;
        //created an integer called result and made it equal to the remainder of
        //positive divided by 10
        int result = positive%10;
        //returns result to the main method
            return result;
        }
        //if the if statement before is false, then these commands will be executed
        else{
            //created an integer called result and made it equal to the remainder
            //of number divided by 10
            int result = number%10;
            //return result to the main method
            return result;     
        }
        
    }
    
}
