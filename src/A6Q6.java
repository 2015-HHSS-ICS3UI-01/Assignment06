
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q6 {

    public static void lastdigit(int num) {
// divid int in to 10 and bring the number of tenth decimal place
        int lastdigit = num % 10;
        num = num / 10;
        System.out.println(lastdigit);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask user to type in number
            System.out.println("Please input number");
            int num = input.nextInt();
            //bring method lastdigit
            lastdigit(num);
        }
    }
}
