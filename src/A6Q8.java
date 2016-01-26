/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public static void Season(int m, int d){
if (d >= 15 || d <= 16)
if (m >= 12 || m <= 3 )
{ 
System.out.println("The season is winter");
}
if (d >= 15 || d <= 16)
if (m >= 3 || m <= 6 )
{
System.out.println("The season is spring");
}   
if (d >= 15 || d <= 16)
if (m >= 6 || m <= 9 )
{ 
System.out.println("The season is summer");
}
if (d >= 15 || d <= 16)
if (m >= 9 || m <= 1)
{  
System.out.println("The season is fall");
}

System.out.println("Enter a month");
int m = input.nextInt();
System.out.println("Enter a day");
int d = input.nextInt();
Season(m,d);

    }
}
