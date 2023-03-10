/*Write a program to do the addition of two matrices.*/
import java.util.Scanner;
public class p_19{
        public static void main(String[] args) {
        Scanner s=null;
        int i,j=0,k,l=0,o,p;
            s=new Scanner(System.in);
            System.out.println("enter rows:");
            int m=s.nextInt();
            System.out.println("enter columns:");
            int n=s.nextInt();
            int a[][]=new int[m][n];
            int b[][]=new int[m][n];
            int c[][]=new int [m][n];
            System.out.println("enter elements of matrix 1:");
            for( i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("enter elements of matrix 2:");
            for( k=0;k<m;k++)
            {
                for( l=0;l<n;l++)
                {
                     b[k][l]=s.nextInt();
                }
            }
             System.out.println("matrix 1:");
            for( i=0;i<m;i++)
            {
                for( j=0;j<n;j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            } 
            System.out.println("matrix 2:");
            for(k=0;k<m;k++)
            {
                for( l=0;l<n;l++)
                {
                    System.out.print(b[k][l] + " ");
                }
                System.out.println();
            } 
            System.out.println("addition:");
            for(o=0;o<m;o++)
            {
                for( p=0;p<n;p++)
                {
                    c[o][p]=a[o][p]+b[o][p];
                }
                System.out.println();
            }
            for( o=0;o<m;o++)
            {
                for( p=0;p<n;p++)
                {
                    System.out.print(c[o][p] + " ");
                }
                System.out.println();
            }
        }
}


OUTPUT:
enter rows:
2
enter columns:
2
enter elements of matrix 1:
2
3
4
5
enter elements of matrix 2:
6
5
4
3
matrix 1:
2 3
4 5
matrix 2:
6 5
4 3
addition:
8 8
8 8
