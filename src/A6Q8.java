/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q8 {

    public static void season(int month, int day) {
        int yearNum = 0; // transfer month, day into number of the year

        if (month == 1) { // january
            yearNum = day;
        } else if (month == 2) { // february
            yearNum = 31 + day;
        } else if (month == 3) { // march
            yearNum = 60 + day;
        } else if (month == 4) { // april
            yearNum = 91 + day;
        } else if (month == 5) { // may
            yearNum = 121 + day;
        } else if (month == 6) { // june
            yearNum = 151 + day;
        } else if (month == 7) { // july
            yearNum = 182 + day;
        } else if (month == 8) { // august
            yearNum = 213 + day;
        } else if (month == 9) { // september
            yearNum = 244 + day;
        } else if (month == 10) { // october
            yearNum = 274 + day;
        } else if (month == 11) { // november
            yearNum = 305 + day;
        } else if (month == 12) { // december
            yearNum = 335 + day;
        }

            String seasonOutput = "Does not compute."; // season calculator
            if (yearNum <= 75) {
                seasonOutput = "Winter";
            } else if (yearNum <= 167) {
                seasonOutput = "Spring";
            } else if (yearNum <= 259) {
                seasonOutput = "Summer";
            } else if (yearNum <= 350) {
                seasonOutput = "Fall";
            } else if (yearNum >= 366) {
                seasonOutput = "Winter";
            }

        System.out.println(seasonOutput);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        season(12, 6);
    }
}
