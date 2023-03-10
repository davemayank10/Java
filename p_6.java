/*Write a program that prompts the user to enter a letter and check 
whether a letter is a vowel or consonant.*/
import java.util.Scanner;
public class p_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter character:");
        char v=s.next().charAt(0);
        if(v=='a'||v=='A'||v=='e'||v=='E'||v=='i'||v=='I'||v=='o'||v=='O'||v=='u'||v=='U')
        {
            System.out.println("vovel");
        }
        else
        {
            System.out.println("consonants");
        }
    }
}


OUTPUT:
enter character:
A
vovel
