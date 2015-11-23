
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question2 {

public static void examGrade(int grade){
    //A grade is given to the user depending on their percentage
    if(grade >= 80){
        System.out.println("A");
    }else if(grade < 80 && grade >= 70){
        System.out.println("B");
    }else if(grade < 70 && grade >= 60){
        System.out.println("C");
    }else if(grade < 60 && grade >=50){
        System.out.println("D");
    }else if(grade < 50){
        System.out.println("F");
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        //The user inputs their percentage into the computer.
        examGrade(grade);
    }
}
