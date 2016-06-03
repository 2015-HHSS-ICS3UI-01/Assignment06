/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author dhalt0019
 */
public class Example {

public static void sayHello(){
    
    System.out.println("Hello");
}
        
public static void sayHello(String name){
    
    System.out.println("Hello " + name);
}

public static double distance(int x1, int y1, int x2, int y2){
    
    double ans = Math.sqrt((x2-x1))*((x2-x1)) + ((y2-y1))*((y2-y1));
    return ans;
}

    public static void toBinary(int num){
        
        StringBuilder ans =  new StringBuilder("");
        // stroing the quotient and remainder
        int q = num;
        int r = 0;
        // while the q is not 0
        while(q != 0){
            // store the remainder when dividing by 2
            r = q % 2;
            // devind quotient
            q = q / 2;
            // apend the remainder
            ans.append(r);
        }
        ans.reverse();
        System.out.println("Binary:" + ans);
        
    }

public static void main(String[] args){
    
    sayHello();
    sayHello("Tanvit");
    
    toBinary(98);
}
}

/* Scanner input = new Scanner(System.in);
System.out.println("Please enter the point (x2,y2) on seperate lines");

int x2 = input.nextInt();
int y2 = input.nextInt();

}
*/