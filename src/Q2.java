
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner in = new Scanner(System.in);
        
        //ask for the grade
        System.out.println("Please enter the grade earned:");
        
        //input the grade
        int gradeValue = in.nextInt();
        
        //set the mark given
        String grade = examLetter(gradeValue);
        
        //output the letter grade
        System.out.println("Letter grade is: " + grade);
    }
    
    //create a method that will print a letter grade to a given mark
    public static String examLetter(int examGrade){
        
        String examLetter = "A";
        //set the letter grade to A 
        if(examGrade >79){
            examLetter = "A";
        //set the letter grade to B
        }else if(examGrade >69 & examGrade < 80){
            examLetter = "B";
        //set the letter grade to C
        }else if(examGrade >59 & examGrade < 70){
            examLetter = "C";
        //set the letter grade to D
        }else if(examGrade >49 & examGrade < 60){
            examLetter = "D";
        //set the letter grade to F
        }else if(examGrade < 50){
            examLetter = "F";
        }
        //return the value of examLetter
        return examLetter;
    }
}
