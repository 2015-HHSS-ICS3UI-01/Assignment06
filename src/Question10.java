
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
        boolean dashesCorrect = true;
        String changedWordOne = setOne;
        String changedWordTwo = setTwo;
        while(dashesCorrect && !changedWordOne.equals("") && !changedWordTwo.equals("")){
            if(changedWordOne.startsWith("-") || changedWordTwo.startsWith("-")){
                if(changedWordOne.startsWith("-") && changedWordTwo.startsWith("-")){
                    dashesCorrect = true;
                    changedWordOne = changedWordOne.substring(1);
                    changedWordTwo = changedWordTwo.substring(1);
                } else{
                    dashesCorrect = false;
                }
            } else{
                dashesCorrect = true;
                changedWordOne = changedWordOne.substring(1);
                changedWordTwo = changedWordTwo.substring(1);
            }
        }
        return dashesCorrect;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first set of letters / digits: ");
        String setOne = input.nextLine();
        System.out.print("Enter the second set of letters / digits: ");
        String setTwo = input.nextLine();
        
        boolean dashesProper = sameDashes(setOne, setTwo);
        
        if(dashesProper){
            System.out.println("The dashes (-) are in the same spots");
        } else{
            System.out.println("The dashes (-) are not in the same spots");
        }
        
        input.close();
    }
}
