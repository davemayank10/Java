/*Write a test program that prompts the user to enter ten numbers, 
invoke a method to reverse the numbers, display the numbers.*/
import java.util.Scanner;
public class p_16 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter no.of value:");
        int n=input.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);

        System.out.print("The reversed numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
}
}
public static void reverse(int[] array) {
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        left++;
        right--;
    }
}
}


OUTPUT:
enter no.of value:
10
Enter numbers: 3
4
6
1
9
0
7
5
1
4
The reversed numbers are: 4 1 5 7 0 9 1 6 4 3
