

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A6Q8 {

    public static String season(int month, int day){
        if(month == 1 || month == 2){
            return "Winter";
        }
        if(month == 12 && day >= 16 && day <= 31){
            return "Winter";
        }
        if(month == 3 && day >= 1 && day <= 15){
            return "Winter";
        }
        if(month == 4 || month == 5){
            return "Spring";
        }
        if(month == 3 && day >= 16 && day <= 31){
            return "Spring";
        }
        if(month == 6 && day >= 1 && day <= 15){
            return "Spring";
        }
        if(month == 7 || month == 8){
            return "Summer";
        }
        if(month == 6 && day >= 16 && day <= 31){
            return "Summer";
        }
        if(month == 9 && day >= 1 && day <= 15){
            return "Summer";
        }
        if(month == 10 || month == 11){
            return "Fall";
        }
        if(month == 9 && day >= 16 && day <= 31){
            return "Fall";
        }
        if(month == 12 && day >= 1 && day <= 15){
            return "Fall";
        }
        return "";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String seasons = season(9, 12);
        System.out.println(seasons); 
    }
}
