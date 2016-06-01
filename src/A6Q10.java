/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A6Q10 {

    public static String sameDashes(String name, String number) {
        StringBuilder sBuilder = new StringBuilder(name);
        StringBuilder sBuilder2 = new StringBuilder(number);
        if (sBuilder.indexOf("-") == -1 && sBuilder2.indexOf("-") == -1) {
            return "true";
        }
        int d = sBuilder.indexOf("-");
        int d2 = sBuilder2.indexOf("-");
        if (d != d2) {
            return "false";
        }
        for (int i = 0; i < sBuilder.length(); i++) {
            if (sBuilder.charAt(i) == '-' && sBuilder2.charAt(i) == '-') {
                if (d == d2) {
                    sBuilder.delete(i, d + 1);
                    sBuilder.delete(i, d2 + 1);
                    if(sBuilder.length() == 0){
                        return "true";
                    }
                }
                if (d != d2) {
                    return "false";
                }
            }
            
        }
        
        return "";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dash = sameDashes("fugs-ojf-ijj-f", "32743-85--88-4");
        System.out.println(dash);
    }
}
