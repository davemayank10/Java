/*Use Cramer's rule to solve the following 2 X 2 system of linear 
equations for x and y: 
ax + by = e x = (ed - bf)/(ad - bc) 
cx + dy = f y = (af - ec)/(ad -bc) 
Write a Java program that prompts the user to enter the constants a, 
b, c, d, e, and f and the display the solution (x =?? and y =??). If 
ad-bc is 0, then your program prints “The equation has no 
solution". 
Note: (1) 3.4x+50.2y=44.5 (2) 2.1x+.55y=5.9*/
import java.util.Scanner;
public class p_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value a:");
        float a=s.nextFloat();
        System.out.println("enter value b:");
        float b=s.nextFloat();
        System.out.println("enter value e:");
        float e=s.nextFloat();
        System.out.println("enter value c:");
        float c=s.nextFloat();
        System.out.println("enter value d:");
        float d=s.nextFloat();
        System.out.println("enter value f:");
        float f=s.nextFloat();
        if((a*d)-(b*c)==0)
        {
            System.out.println("the equation has no solution");
        }
        else
        {
        float x=(e*d-b*f)/(a*d-b*c);
        System.out.println("x="+x);
        float y=(a*f-e*c)/(a*d-b*c);
        System.out.println("y="+y);
        }
    }
}
/*OUTPUT:
enter value a:
3.4
enter value b:
50.2
enter value e:
44.5
enter value c:
2.1
enter value d:
.55
enter value f:
5.9
x=2.6239018
y=0.70873976
