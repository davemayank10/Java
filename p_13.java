/*Write a program that prompts the user to enter a decimal number 
and displays the number in a fraction.*/
import java.util.Scanner;
class Fraction { 
  
        private int real; 
        private int image; 
     
        Fraction(int r,int i) 
        { 
            real=r; 
            image=i; 
        } 
        public long gcm(long a,long b) 
        { 
               return b==0?a:gcm(b, a%b); 
        } 
        public String toString(){ 
            long gcm= gcm(real, image); 
            return real/gcm+"/"+image/gcm; 
        } 
    } 
   
public class p_13 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); 
         System.out.print("Enter a Decimal Number: "); 
         String d= sc.nextLine(); 
        sc.close(); 
        int index=d.indexOf("."); 
        int len=d.substring(index).length(); 
         int image=(int)Math.pow(10, len-1); 
         int real=(int)(Double.parseDouble(d)*image); 
         Fraction fr=new Fraction(real, image); 
         System.out.println("The Fraction number is:"+fr); 
      } 
}


OUTPUT:
Enter a Decimal Number: .025
The Fraction number is:1/40
