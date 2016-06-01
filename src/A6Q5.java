

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A6Q5 {

    public static void chaotic(int randNum){
    
     if(randNum == 1){
         System.out.println("*");
     }
     if(randNum == 2){
         System.out.println("**");
     }
     if(randNum == 3){
         System.out.println("***");
     }
     if(randNum == 4){
         System.out.println("****");
     }
     if(randNum == 5){
         System.out.println("*****");
     }

           
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randNum = (int)(Math.random()*(5-1+1))+1;
        chaotic(randNum);
    }
}
