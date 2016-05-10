
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q7 {

    public static void firstdigit(int num) {
        //change integer in to string and return position 0 to 1
        int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
        System.out.println(firstDigit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            // ask  user to input number
            System.out.println("Please input number");
            int num = input.nextInt();
            //bring method
            firstdigit(num);
        }
    }
}
