
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q5 {

    public static String chaotic() {
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;                  //Equation for randomizer
        String as = "*";                                                        //Starts with a single asterisk
        randNum = randNum - 1;                                                 
        while (randNum > 0) {                                                   //Adds more asterisks
            as = as + "*";
            randNum = randNum - 1;
        }
        return as;                                                              //returns the row
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input number of rows");                            //Asks for rows
        int l = input.nextInt();                                                //Recieves number of rows
        while (l > 0) {                                                         //loop to make rows of asterisks
            System.out.println(chaotic());
            l = l - 1;
        }
    }
}
