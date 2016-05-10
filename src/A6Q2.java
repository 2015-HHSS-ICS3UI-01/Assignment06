
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q2 {

    public static void grade(int mark) {
        //determine the mark using the range of grade for every respective mark
        if (mark < 50) {
            System.out.println("You got F");
        } else if (50 <= mark && mark < 60) {
            System.out.println("You got D");
        } else if (60 <= mark && mark < 70) {
            System.out.println("You got C");
        } else if (70 <= mark && mark < 80) {
            System.out.println("You got B");
        } else if (80 <= mark) {
            System.out.println("You got A");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask for grade
            System.out.println("Please input your grade.");
            int mark = input.nextInt();
            //bring mark from method above
            grade(mark);
        }
    }
}
