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
