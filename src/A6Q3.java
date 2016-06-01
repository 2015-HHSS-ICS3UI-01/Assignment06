


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A6Q3 {

    public static void factors(int num) {
        
    for(int i = 1; i < num + 1; i++){
        if(num%i == 0){
            System.out.println(i);
        }
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factors(24);
    }
}
