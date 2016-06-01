


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A6Q1 {

    public static double circleArea(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area = circleArea(1);
        System.out.println(area);
    }
}
