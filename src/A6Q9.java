
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A6Q9 {

    public static void allDigitsOdd(int numbOdd) {

        

        
        while (true) {
            int lastNumb = numbOdd % 10;
            
            //if the last number is odd, take th next one off
            if ((lastNumb == 9)
                    || lastNumb == 7
                    || lastNumb == 5
                    || lastNumb == 3
                    || lastNumb == 1) {
                numbOdd = numbOdd / 10;
            }


            //if the number is even break the loop, finish the program
                if ((lastNumb == 8)
                        || lastNumb == 6
                        || lastNumb == 4
                        || lastNumb == 2) {



                    System.out.println("False");
                    break;
                }

                //if the number is 0 then all number are even
                if (numbOdd == 0) {

                    System.out.println("True");
                    break;
                }

            

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make the scanner
        Scanner input = new Scanner(System.in);

        //ask the user for the number they would like the 
        System.out.println("Please enter the number that you would like to know if it has all odd digits.");
        int numbOdd = input.nextInt();

        //run the method
        allDigitsOdd(numbOdd);

    }
}
