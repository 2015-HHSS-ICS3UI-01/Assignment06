/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q8 {

    public static void seasons(int month, int day) {

        int num = 0;

        if (month == 1) {//january
            num = day;
        }
        if (month == 2) {//february
            num = 31 + day;
        }
        if (month == 3) {//march
            num = 60 + day;
        }
        if (month == 4) {//april
            num = 91 + day;
        }
        if (month == 5) {//may
            num = 121 + day;
        }
        if (month == 6) {//june
            num = 152 + day;
        }
        if (month == 7) {//july
            num = 182 + day;
        }
        if (month == 8) {//august
            num = 213 + day;
        }
        if (month == 9) {//september
            num = 244 + day;
        }
        if (month == 10) {//october
            num = 274 + day;
        }
        if (month == 11) {//november
            num = 305 + day;
        }
        if (month == 12) {//december
            num = 335 + day;
        }
        if (num <= 75) {//if its between the days of winter
            System.out.println("Winter");//return winter
        } else if (num >= 351) {//if its between the days of winter
            System.out.println("Winter");//return winter
        } else if (num <= 167 && num >= 76) {//if its between the days of spring
            System.out.println("Spring");//return spring
        } else if (num <= 259 && num >= 168) {//if its between the days of summer
            System.out.println("Summer");//return summer
        } else if (num <= 350 && num >= 260) {//if its between the days of fall
            System.out.println("Fall");//return fall
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        seasons(2, 29);
    }
}
