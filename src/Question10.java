
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question10 {

    public static boolean sameDashes(String setOne, String setTwo) {
        boolean dashes = true;
        while(dashes && setOne.equals("") && setTwo.equals("")){
            String startOne = setOne;
            String startTwo = setTwo;
            startOne = startOne.substring(0, 1);
            startTwo = startTwo.substring(0, 1);
            if(startOne == startTwo){
                dashes = true;
                startOne = startOne.substring(1);
                startTwo = startTwo.substring(1);
            } else{
                dashes = false;
            }
        
        return dashes;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first set of letters / digits: ");
        String setOne = input.nextLine();
        System.out.println("Enter the second set of letters / digits: ");
        String setTwo = input.nextLine();
        
        System.out.println(sameDashes(setOne, setTwo));
    }
}
