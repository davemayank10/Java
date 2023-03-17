/*Write a method with following method header. public static int 
gcd(int num1, int num2)Write a program that prompts the user to 
enter two integers and compute the gcd of two integers.*/

import java.util.Scanner;
public class p_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        // Compute the GCD
        int gcd = gcd(num1, num2);
        
        // Display the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}


OUTPUT:
Enter two integers: 24
18
The GCD of 24 and 18 is 6
