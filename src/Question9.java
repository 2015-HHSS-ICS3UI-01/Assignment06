
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question9 {
    //create a method to determine if all digits are odd and if not it will return false

    public static void allDigitsOdd(double number) {
        if (number < 0) {
            number = number * (-1);
        }



        while (number >= 0) {
            double lastdigit = number % 10;
            double remainder = number / 10;
            double lastdigitdec = lastdigit * 0.1;
            number = remainder - lastdigitdec;
            if (lastdigit == 0 || lastdigit == 2 || lastdigit == 4 || lastdigit == 6 || lastdigit == 8) {
                System.out.println("False");
                break;

            }
            if (number < 10) {
                if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9) {
                    System.out.println("True");
                    break;
                } else {
                    System.out.println("False");
                    break;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input a number and insert it into the method
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        double number = input.nextDouble();
        allDigitsOdd(number);
    }
}
