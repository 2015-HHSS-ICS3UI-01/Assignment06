
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A6Q9 {

    public static boolean alldigitsodd(int number) {
        //while true repeat infinite
        while (true) {
            //check to see if the lasat digit of the number is an odd digit 
            int lastDigit = number % 10;
            if (lastDigit == 9
                    || lastDigit == 7
                    || lastDigit == 5
                    || lastDigit == 3
                    || lastDigit == 1) {
                // get rid of the lsat digit so that the program gcan check the next digit
                number = number / 10;

            }//check to see if the last digit of the number is a even
            if (lastDigit == 8
                    || lastDigit == 6
                    || lastDigit == 4
                    || lastDigit == 2) {
                //if any odd number is found then return false. 
                return false;
            }
            //if the number is 0(there is nothing left to check) then break loop
            if(number==0){
                break;
            }
        }
        //if no even numbers are found then return true 
        return true;
    }

        /**
         * @param args the command line arguments
         */
    

    

    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);
        //ask user a number 
        System.out.println("Please enter a number ");
        //allow user to enter number 
        int number = input.nextInt();
       //send answer bacak the method
        boolean Num = alldigitsodd(number);
        //tell user if it is false 
        System.out.println(""+Num);
  
    }
}

