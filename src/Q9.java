
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //input 
        Scanner in = new Scanner(System.in);

        //ask user for a number
        System.out.println("Please input a number");

        //next input the the number
        int number = in.nextInt();

        //run the method
        boolean answer = allDigitsOdd(number);

        if (answer == true) { //if the method returned true
            System.out.println("All digits are odd"); //output all digits are odd
        } else { //otherwise
            System.out.println("Not all digits are odd"); //output not all digits are odd
        }
    }

    public static boolean allDigitsOdd(int number) {

        int testDigit = 0; //create the int test digit

        int findRemainder = 1; //create the int rind remainder

        boolean answer = false; //creat the int answer
        while (findRemainder < number) { //run until "findRemainder" is greater than the number

            int currentNumber = number; //refresh the number being divided
            testDigit = (currentNumber / findRemainder) % 10; //find if the remainder of the digit is 1 or 0
            findRemainder = findRemainder * 10; //multiply "findRemainder" by 10 for the next digit test
            if (testDigit == 1) { //if the remainder is 1
                answer = true; //the number is odd
            }else{ //otherwise
                answer = false; //the number is even
                break; //break the while loop
            }
        }
        return answer; //return the result


    }
}
