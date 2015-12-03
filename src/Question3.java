/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factors(10);
    }
    
    //created a method that will numbers that divide evenly with a given number
    public static void factors(double number){
        
        
       
           
          for(double guess = 1; guess <= number; guess++){
          //created a variable called factor and made it equal to the remainder 
          //of number divided by guess
           double factor = number%guess;
          //created a variable called factortwo and made it equal to number divided by guess 
           double factortwo = number/guess;
           //if factor equals 0, then factortwo will be printed on the screen
           if(factor == 0){
              System.out.println(factortwo);}
           
          }
          
           
           
       
        
        
        
    }
}
