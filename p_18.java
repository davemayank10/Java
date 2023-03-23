/* Write a program to sort the elements from given array of integer. 
Specify size of array and elements of array from command line 
argument.*/
import java.util.Scanner;
import java.util.Arrays;
public class p_18 { 
     public static void main(String[] args) { 
         Scanner sc=new Scanner(System.in); 
         System.out.print("Enter no. of elements you want to enter:"); 
         int n=sc.nextInt(); 
         int[] num=new int[n]; 
         System.out.print("Enter the elements:"); 
         for (int i = 0; i < num.length; i++) { 
             num[i]=sc.nextInt(); 
         } 
       Arrays.sort(num); 
         System.out.print("Sorted array:"); 
         for (int i = 0; i < num.length; i++) { 
             System.out.print(" "+num[i]); 
         } 
     } 
 }


OUTPUT:
enter no.of elements you want to enter:5
enter elements:4
  7
  1
  9
  5
  Sorted array:1  4  5  7  9 
