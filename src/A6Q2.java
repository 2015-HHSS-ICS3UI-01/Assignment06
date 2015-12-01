
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Please enter a grade ");
        
        int exameGrade = input.nextInt();
        
        if (exameGrade< 50) {
            System.out.println(" F ");
        }
        if (exameGrade>50&exameGrade<59) {
            System.out.println(" D ");
        }
        if (exameGrade>60&exameGrade<69) {
            System.out.println(" C ");
        }  
        if (exameGrade>70&exameGrade<79) {
            System.out.println(" B ");
        }
        if (exameGrade>80) {
            System.out.println(" A ");
        }
    }
}
