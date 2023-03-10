/*Write a program that reads a number in meters, converts it to feet, 
and displays the result.*/
import java.util.Scanner;
public class p_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value in meter:");
        double m=s.nextDouble();
        double f=m*(3.2808399);
        System.out.println("converted in feet:"+f);
    }
}

OUTPUT:
enter value in meter:
35
converted in feet:114.8293965
