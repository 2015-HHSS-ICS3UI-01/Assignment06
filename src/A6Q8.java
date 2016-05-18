/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static String season(int month, int day) {
        //FOR WINTER

        if (month == 12 && day > 15 && day < 32 || month == 3 && day < 16 && day > 0 || month > 0 && month < 3 && day < 32 && day > 0) {//month equals 12, and day is between 16-32
//, or if month is 3 and day is between 0-16, or if month is 12 and day is between 12-31 or if it is any month/day inbetween

            String season = "Winter"; // set season string as Winter

            return season; //return statement

            //FOR SPRING
        }
        if (month == 3 && day > 15 && day < 32 || month == 6 && day > 0 && day < 16 || month > 3 && month < 6 && day > 0 && day < 32) {
            //if month is 3 and day is 16-31, or month is 6 and day is 0-15, or if it is an mon/day inbetween

            String season = "Spring"; // set season string as Spring

            return season;//return statement

            //FOR SUMMER
        }
        if (month == 6 && day > 15 && day < 32 || month == 9 && day < 16 && day > 0 || month > 6 && month < 9 && day < 32 && day > 0) {
//if month is 6 and day is 16-31, or month  is 9 and day is 0-15, or any month/day in between
            String season = "Summer"; // set season string as Summer

            return season;//return statement

            //FOR FALL
        }
        if (month == 9 && day < 32 && day > 15 || month == 12 && day > 0 && day < 16 || month > 9 && month < 12 && day > 0 && day < 32) {
            //if month is 9 and day is 16-31, or if month is 12 and day is between 0-15, or any month/day in between
            String season = "Fall";// set season string as Fall

            return season;//return statement
        }
        return ""; // return blank to satisfy method


    }

    public static void main(String[] args) {
        // TODO code application logic here
        String season = season(12, 15);

        System.out.println(season); // output season returned



    }
}
