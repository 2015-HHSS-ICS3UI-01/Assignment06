/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A6Q5 {

//Prints out the numbers and i dont know why.
public static void Chaotic(){
for (int i = 7; i > 0; i-- ){    
int randNum =(int)(Math.random()*(5-1+1))+1;


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
if(randNum == 6){
    System.out.println("******");
}    
if(randNum == 7){
    System.out.println("*******");
}    
}
}
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Chaotic();      
    }
}

