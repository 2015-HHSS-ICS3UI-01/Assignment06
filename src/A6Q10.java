
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author snowc4636
 */
public class A6Q10 {

    public static void sameDashes(String one, String two) {

        while (true) {
            int first = one.indexOf("-");
            int second = two.indexOf("-");
         

            if (first == second && first >= 0) {
                one = one.substring(first +1);
                two = two.substring(second +1);
               
            }else if(first == -1 && second == -1){
                System.out.println(" This statement is true");
                break;
            }
            else {


                System.out.println(" This statement is false");
                break;
            }
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //

        Scanner input = new Scanner(System.in);
        // enter a word
        System.out.println("Please enter a word with at least 1 dash in it ");
        String one = input.nextLine();
        // enter another word
        System.out.println(" Please enter another word with at least 1 dash in it");
        String two = input.nextLine();
        // formula
        sameDashes(one, two);
    }
}
