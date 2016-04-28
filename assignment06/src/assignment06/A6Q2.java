/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

import static assignment06.A6Q2.examGrade;

/**
 *
 * @author fostp4040
 */
public class A6Q2 {
    public static void examGrade(int examPercent){
        if(examPercent<50){
            System.out.println("your grade is a F");
        }else if(examPercent>=50&&examPercent<=59){
            System.out.println("your grade is a D");
        }else if(examPercent>=60&&examPercent<=69){
            System.out.println("your grade is a C");
        }else if(examPercent>=70&&examPercent<=79){
            System.out.println("your grade is a B");
        }else if(examPercent>=80){
            System.out.println("your grade is an A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        examGrade(70);
    }
}
