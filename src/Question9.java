/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a string called ans and made it equal to the 
        //allDigitsOdd method with a given integer
        String ans = allDigitsOdd(127236579);
        //prints ans onto the screen
        System.out.println(ans);

    }
//created a String method that uses one integer
    public static String allDigitsOdd(int number) {
//created a string named nottrue and made it equal to "False"
        String nottrue = "False";
        //created a string named tootrue and made it equal to "True"
        String tootrue = "True";
        
        //created an integer called firstdivide and made it equal to 
        //number divided by 10
        int firstdivide = number/10;
        //created an integer called first and made it equal to the remainder of 
        //number divided by 10
        int first = number % 10;
        //created an integer called firstcheck and made it equal to the remainder 
        //of first divided by 2
        int firstcheck = first % 2;
        //if first is more than or equal to one and first check is not 0, then 
        //nottrue is returned to the main method
        if (first >= 1) {
            if (firstcheck == 0) {
                return nottrue;
            }
        }
        //if firstdivide is more than or equal to 1 and firstcheck is not equal
        //to zero, then the following commands will be executed
        if (firstdivide >= 1) {
            if (firstcheck != 0) {
                //while firstdivide is more than or equal to 1, the commands
                //in the while loop will be executed until told to stop
                while(firstdivide >= 1){
                    first = firstdivide%10; 
                    firstcheck = first%2;
                    firstdivide = firstdivide/10;
                    //if firstcheck equals zero, nottrue is returned to the 
                    //main method
                    if(firstcheck == 0){
                       return nottrue; 
                        
                    }
                }
                //returns tootrue to the main method
                return tootrue;
            }
        }
        
       //returns "" to the main method, but it shouldn't 
        //get to this point in the code 
        return "";
        
        
    }
}
