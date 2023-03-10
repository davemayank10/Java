/*Body Mass Index (BMI) is a measure of health on weight. It can be 
calculated by taking your weight in kilograms and dividing by the 
square of your height in meters. Write a program that prompts the 
user to enter a weight in pounds and height in inches and displays 
the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters*/
import java.util.Scanner;
public class p_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter weight in pound:");
        double w=s.nextDouble();
        System.out.println("enter height in inches:");
        double h=s.nextDouble();
        double k=w*(0.45359237);
        System.out.println("weight in kg:"+k);
        double m=h*(0.0254);
        System.out.println("height in meter:"+m);
        double b=k/(m*m);
        System.out.println("BODY MASS INDEX:"+b);
    }
}

OUTPUT:
enter weight in pound:
123
enter height in inches:
34
weight in kg:55.791861510000004
height in meter:0.8635999999999999
BODY MASS INDEX:74.8075763802912
