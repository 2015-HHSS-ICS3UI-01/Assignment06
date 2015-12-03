
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A6Q10 {
    
    public static boolean samedashes(String string1, String string2){
        
       int wordlength1 =string1.length(); //check length of string one 
       int wordlength2=string2.length();//check length of string 2 
       int biggerword=0;   //make a new variable(will store the longer word and set it to 0 
       
       //if the first word is longer then the second then set the word to the first word 
       if(wordlength1>wordlength2){
           //craete new variable to store bigger word and set it two the first word 
            biggerword= wordlength1;
           } else{
           //else the seconds word is bigger and it is stored in the variable 
            biggerword=wordlength2;
       }
       int counter=0; // create a varible that will help count the letters 
       //while the word is larger than the counter repeat loop
       while( biggerword>counter){
           //find the first dash in the first word
           int dashwordA=string1.indexOf("-");
           //fidn the second dash in the first word 
           int dashwordB=string2.indexOf("-");
           //if he dashes are not in the same spot then return false 
           if (dashwordA!=dashwordB){
               //return false 
               return false;
           }
           //add one one to the counter each time 
           counter++;
           //replace the first dash with ""(nothing)cin the first word 
           string1=string1.replaceFirst("-","" );
           //replace the first dash with ""(nothing) in the second word 
           string2=string2.replaceFirst("-", "");
       }
       return true;
    } 
        
    
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new sacnner 
        Scanner input = new Scanner(System.in);
        //ask user to enter string 
        System.out.println("please enter a string ");
        //allow user to enter a string 
        String string1=input.nextLine();
        //ask user to enter another string 
        System.out.println("Please enter another string ");
        String string2=input.nextLine();
        //retunr anserws to the samedashes method 
       boolean finalanswer =samedashes(string1,string2);
       //if the the answer returns ture then let user know dashes are in the same spot meaning it is true
       if(finalanswer==true){
           System.out.println(" (TRUE) Dashes in both words are in the same place");
        
        //else let the user know (false ) the dashes are not in the same places meaning it is false 
    } else{
           System.out.println(" (FALSE) The dashes in the words are not in the same spot)");
       }
}
}