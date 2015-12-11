

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Question5 {
    //create procedure method

    public static void chaotic(int numLines) {

        //generate lines of random stars until required amount is met
        for (int linesTyped = 0; numLines > linesTyped; linesTyped = linesTyped + 1) {
            //generate number between 1 and 5
            int randNum = (int) (Math.random() * 5) + 1;
            //use random number generated to create a line of stars (keep adding stars to line until randNum is reached)
            for (int starsOut = 0; randNum > starsOut; starsOut = starsOut + 1) {
                //output star
                System.out.print("*");
            }
            //create space (enter key) to enter next line
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//number of lines to print (send to chaotic method)
        chaotic(5);

    }
}
