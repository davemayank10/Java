/*Write a program that reads an integer and displays all its smallest 
factors in increasing order. For example if input number is 120, the 
output should be as follows:2,2,2,3,5.*/
import java.util.Scanner;
public class p_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = s.nextInt();
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.print(factor + " ");
                number /= factor;
            }
            else {
                factor++;
            }
    }
}
}


OUTPUT:
Enter an integer: 150
2 3 5 5 
