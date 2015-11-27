/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question5 {

    public static void chaotic(int asterisks){
        int randomNumber = (int)(Math.random()*(5-1+1))+ 1;
        if(randomNumber == 1){
            System.out.println("*");
        }if(randomNumber == 2){
            System.out.println("**");
        }if(randomNumber == 3){
            System.out.println("***");
        }if(randomNumber == 4){
            System.out.println("****");
        }if(randomNumber == 5){
            System.out.println("*****");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int randomNumber = (int)(Math.random()*(5-1+1))+ 1;
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
       chaotic(randomNumber);
          
          
        
    }
}
