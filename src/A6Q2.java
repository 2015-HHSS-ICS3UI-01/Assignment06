
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        int examGrade = 0;        
        
 while(true) {
            System.out.println("What is the percentage of your Exam? ");
            examGrade = input.nextInt();
//Whenever the user inputs their percentage that is higher or lower than 0 and 100, the program will restart
            if (examGrade >= 0 && examGrade <= 100)
                break;
         
             }
//100 is the max, and 80 is the minumum for a grade A, etc for the other if statments
        if (examGrade <= 100 && examGrade >= 80) {
             System.out.println("A");
        }
        else if (examGrade <= 79 && examGrade >= 70) {
             System.out.println("B");
        }       
        else if (examGrade <= 69 && examGrade >= 60){
            System.out.println("C");
        }
             else if (examGrade <= 59 && examGrade >= 50){
             System.out.println("D");
         }
             else if (examGrade <= 49 && examGrade >= 0){
                 System.out.println("F");
             }  
         
         }
}
