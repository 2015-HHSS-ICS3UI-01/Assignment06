/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created ans and made it equal to the sameDashes 
        //method with given String
        boolean ans = sameDashes("hi--there-you.", "12--(134)-7539");
        //prints ans onto the screen
        System.out.println(ans);
    }
//created a boolean method called sameDashes and it uses two Strings
    public static boolean sameDashes(String firstword, String secondword) {

        //created integers names space,spacetwo,backup and backup two, and made
        //all equal to 0
        int space = 0;
        int spacetwo = 0;
        int backup = 0;
        int backuptwo = 0;
        //created integers named firstlength and second length and made them
        //equal to their word length
        int firstlength = firstword.length();
        int secondlength = secondword.length();
        //while space is less than or equal to firstlength or while spacetwo is
        //less than or equal to secondlength, the following commands will be looped
        //until told to stop
        while (space <= firstlength
                || spacetwo <= secondlength) {
            
        //if a space in the first word has a dash in it and the same space 
        //in the second word doesn't (or vice versa), then false is returned to
        //the main method
            if (firstword.charAt(space) == '-' && secondword.charAt(spacetwo) != '-'
                    || firstword.charAt(space) != '-' && secondword.charAt(spacetwo) == '-') {
                
                return false;
            }
        //if space is equal tofirstlength - 2 and spacetwo is equal to 
            //secondlength - 2, then true is returned to the main method
            if (space == firstlength - 2 && spacetwo == secondlength - 2) {
                
                return true;
            }
            
            space = space + 1;
            spacetwo = spacetwo + 1;
        //if space is equal to firstlength - 1 and that space in the firstword
            //is not a dash, then space will then equal firstlength - 2
            if (space == firstlength - 1) {
                if (firstword.charAt(space) != '-') {
                    space = firstlength - 2;
                    //if that space is the first word does have a dash in it,
                    //the follwing commands will be executed
                } else {
                    //while that same space - backup has a dash in it, backup
                    //gets one added to it each time it loops
                    while (firstword.charAt(space) - backup == '-') {
                        backup = backup + 1;
                        //if that space in the firstword - backup does not have
                        //a dash in it, then space now equals firstlength - backup
                        //and it breaks out of the while loop
                        if(firstword.charAt(space) - backup != '-'){
                            space = firstlength - backup;
                            break;
                        }
                    }
                }
            }
//if spacetwo is equal to secondlength - 1 and that space in the secondword
            //is not a dash, then spacetwo will then equal secondlength - 2
            if (spacetwo == secondlength - 1) {
                if (secondword.charAt(spacetwo) != '-') {
                    spacetwo = secondlength - 2;
                    //if that space is the second word does have a dash in it,
                    //the follwing commands will be executed
                } else {
                    //while that same space - backuptwo has a dash in it, backuptwo
                    //gets one added to it each time it loops
                    while (secondword.charAt(spacetwo) - backuptwo == '-') {
                        backuptwo = backuptwo + 1;
                        //if that space in the secondword - backuptwo does not have
                        //a dash in it, then spacetwo now equals fsecondlength - backuptwo
                        //and it breaks out of the while loop
                        if (secondword.charAt(spacetwo) - backuptwo != '-') {
                            spacetwo = secondlength - backuptwo;
                            break;
                        }
                    }
                }
            }
            //if the firstword ends with a dash and the second doesn't 
            //(or vice versa), then false is returned to the main method
            if(firstword.endsWith("-") && !secondword.endsWith("-")
                    ||secondword.endsWith("-") && !firstword.endsWith("-")){
                
                return false;
            }



        }
        //returns false to the main method, but it shouldn't get to this point
        //in the code
        return false;


















    }
}
