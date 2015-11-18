
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q5 {

    public static void chaotic( int line) {
        while(line>0){
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
       
           for(int numS = 0; numS < randNum; numS++){
           System.out.print("*");
       }
        System.out.println("");
        line--;
       }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        chaotic(line);

    }
}
