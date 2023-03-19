/*Write a program to count the number of words that start with 
capital letters.*/
import java.util.Scanner;
public class p_8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string:");
        String a=s.nextLine();
        int count=0;
        String[] words=a.split("\\s+");
        for(String word:words)
        {
            if(Character.isUpperCase(word.charAt(0)))
            {
                count++;
            }
        }
        System.out.println("no. of words startin with capital letter: "+count);
    }
}


OUTPUT:
enter string:
My name is Mayank
no. of words startin with capital letter: 2
