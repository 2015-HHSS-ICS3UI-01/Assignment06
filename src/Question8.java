/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//created a string called ans and made it equal to the season method with the 
//numbers 11 and 11
        String ans = season(11,11);
        //prints ans onto the screen
        System.out.println(ans);


    }
//created a String method that uses two integers
    public static String season(int month, int day) {
//created string named winter, spring, summer and fall, and made them 
//equal to their names
        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String fall = "Fall";
//if month is equal to 12,1,2 or 3, the following commands will be executed
        if (month == 12
                || month == 1
                || month == 2
                || month == 3) {
            //if month is equal to 12, and day is more than or equal to 16, 
            //then winter is returned to the main method
            if (month == 12) {
                if (day >= 16) {
                    return winter;
                }
            }
            //if month is equal to 3, and day is less than or equal to 15, 
            //then winter is returned to the main method
            if (month == 3) {
                if (day <= 15) {
                    return winter;

                }
            }
            //if month is less than or equal to 2, then winter is returned to 
            //the main method
            if (month <= 2) {
                return winter; 
            }

        }
        //if month is equal to 3,4,5 or 6, the following 
        //commands will be executed
        if (month == 3
                || month == 4
                || month == 5
                || month == 6) {
            //if month is equal to 3, and day is more than or equal to 16, 
            //then spring is returned to the main method
            if (month == 3) {
                if (day >= 16) {
                    return spring;
                }
            }
            //if month is equal to 6, and day is less than or equal to 15, 
            //then spring is returned to the main method
            if (month == 6) {
                if (day <= 15) {
                    return spring;

                }
            }
            //if month is less than or equal to 5 but not equal to 3, then 
            //spring is returned to the main method
            if (month <= 5) {
                if (month != 3) {
                    return spring; 
                }
            }

        }
        //if month is equal to 6,7,8 or 9, then the following 
        //commands will be executed
        if (month == 6
                || month == 7
                || month == 8
                || month == 9) {
            //if month is equal to 6, and day is more than or equal to 16, 
            //then summer is returned to the main method
            if (month == 6) {
                if (day >= 16) {
                    return summer;
                }
            }
            //if month is equal to 9, and day is less than or equal to 15, 
            //then summer is returned to the main method
            if (month == 9) {
                if (day <= 15) {
                    return summer;

                }
            }
            //if month is less than or equal to 8 but not equal to 6, then 
            //summer is returned to the main method
            if (month <= 8) {
                if (month != 6) {
                    return summer; 
                }
            }

        }
        //if month is equal to 9,10,11 or 12, then the following 
        //commands will be executed
        if (month == 9
                || month == 10
                || month == 11
                || month == 12) {
            //if month is equal to 9, and day is more than or equal to 16, 
            //then fall is returned to the main method
            if (month == 9) {
                if (day >= 16) {
                    return fall;
                }
            }
            //if month is equal to 12, and day is more than or equal to 15, 
            //then fall is returned to the main method
            if (month == 12) {
                if (day <= 15) {
                    return fall;

                }
            }
            //if month is less than or equal to 11 but not equal to 9, then 
            //fall will be returned to the main method
            if (month <= 11) {
                if (month != 9) {
                    return fall; 
                }
            }

        }



//returns "6" to the main method, but it shouldn't get to this point in the code
        return "6";


    }
}
