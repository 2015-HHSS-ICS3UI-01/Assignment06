/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //these are the numbers being used in the correct order
        chaotic(1, 5, 0);
    }
//created a void method called chaotic that uses the intergers
    public static void chaotic(int firstnum, int lastnum, int lines) {
        //everything in this while loop will be executed
        while (true) {
            //created an int called randnum and made it equal to a random number
            //between 1 and 5
            int randnum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            
            //if randnum equals one, one star will be put onto the screen
            //and one gets added to lines
            if (randnum == 1) {
                System.out.println("*");
                lines = lines + 1;
            }
            //if randnum equals two, two star will be put onto the screen
            //and one gets added to lines
            if (randnum == 2) {
                System.out.println("**");
                lines = lines + 1;
            }
            //if randnum equals three, three star will be put onto the screen
            //and one gets added to lines
            if (randnum == 3) {
                System.out.println("***");
                lines = lines + 1;
            }
            //if randnum equals four, four star will be put onto the screen
            //and one gets added to lines
            if (randnum == 4) {
                System.out.println("****");
                lines = lines + 1;
            }
            //if randnum equals five, five star will be put onto the screen
            //and one gets added to lines
            if (randnum == 5) {
                System.out.println("*****");
                lines = lines + 1;
            }
            //if lines equal 5, the program will break out of the while loop
            if(lines == 5){
                break;
            }
            
        }
    }
}
