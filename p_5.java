/*Write a program that prompts the user to enter three integers and 
display the maximum number among these numbers.*/
import java.util.Scanner;
public class p_5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("max="+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("max="+b);
        }
        else
        {
            System.out.println("max="+c);
        }
    }
}

OUTPUT:
20
40
60
max=60
