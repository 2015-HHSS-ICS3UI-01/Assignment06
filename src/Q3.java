/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q3 {
    public static int factors(int f){
        while(true){
            for(int i = 1;i>0;i++){
            f = f%i;}
            if(f==0){
                System.out.println(""+f);
            }else if(f>f){
                break;
            }
        }
        
        return f;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
