/*Write a program to find length of string and print second half of 
the string.*/
import java.util.Scanner;
public class p_7 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=new String();
        System.out.println("enter string:");
        s=a.nextLine();
        int sl=s.length();
        System.out.println("lenght:"+sl);
        int len=sl/2;
        String m=s.substring(len,sl);
        System.out.println("second half:"+m);
    }
}

OUTPUT:
enter string:
java
lenght:4
second half:va
