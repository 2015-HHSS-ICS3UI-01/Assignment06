/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static String season(int month, int day){
        String season;
        if(month < 1
                || month > 12
                || day < 1
                || day > 31){
            season = "Invalid date.";
        }else if((month == 12
                && day >= 16)
                || month < 3
                || (month == 3
                && day <= 15)){
            season = "Winter";
        }else if(month == 4
                || (month == 3
                && day >= 16)
                || (month == 6
                && day <= 15)){
            season = "Spring";
        }else if
        return season;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
