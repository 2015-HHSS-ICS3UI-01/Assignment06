
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q2 {

    public static void examGrade (int grade){
        //Checks what grade the exam percentage is
        if(grade<50){
            System.out.println("F");
        }else if(grade>=50&&grade<=59){
            System.out.println("D");
        }else if(grade>=60&&grade<=69){
            System.out.println("C");
        }else if(grade>=70&&grade<=79){
            System.out.println("B");
        }else if(grade>=80&&grade<=100){
            System.out.println("A");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //Asks user for exam percentage
        System.out.println("Enter exam percentage");
        //gets percentage from user
        int grade = input.nextInt();
        //uses the "examGrade" method
        examGrade(grade);
    }
}
