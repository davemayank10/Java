/*Write a program to check the given number is Prime or not.*/
import java.util.Scanner;
public class p_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.:");
        int a=s.nextInt();
        int flag=0;
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println(a+ " prime no.");
        }
        else
        {
            System.out.println(a+ " not prime no.");
        }
    }
}

OUTPUT:
enter no.:
3
3 prime no.
