
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    
    public static int examGrade(int g1){
        if(g1 < 50){
            System.out.println("the exam grade is an F.");
        }
        if(g1 < 60 && g1 >= 50){
            System.out.println("the exam grade is an D.");
        }
        if(g1 < 70 && g1 >= 60){
            System.out.println("the exam grade is an C.");
        }
        if(g1 < 80 && g1 >= 70){
            System.out.println("the exam grade is an B.");
        }
        if(g1 >= 80){
            System.out.println("the exam grade is an A.");
        }
        return g1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the exam percentage here.");
        int g1 = input.nextInt();
        
        int examGrade = examGrade(g1);
        }
    }
