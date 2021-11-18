import java.util.Scanner;
import java.lang.Math;

public class Lab4_q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the number of rows : ");
        n1= sc.nextInt();
        System.out.println("Enter the number of columns : ");
        n2= sc.nextInt();

        System.out.println("Enter the matrix elements in order: ");
        int a[][]= new int[n1][n2];
        for (int i=0;i<n1;i++)
        {
            for (int j=0;j<n2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix that you entered is : ");
        for (int i=0;i<n1;i++)
        {
            for (int j=0;j<n2;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        int trace=0;
        for (int i=0;i<n1;i++)
        {
            for (int j=0;j<n2;j++)
            {
                if(i==j)
                {
                    trace+=a[i][j];
                }
            }
        }
        System.out.println("The trace of the matrix is : "+trace);

        double norm =0;
        int sum=0;
        for (int i=0;i<n1;i++)
        {
            for (int j=0;j<n2;j++)
            {
                sum+=a[i][j]*a[i][j];
            }
        }
        norm = Math.sqrt(sum);
        System.out.println("The norm of the matrix is : "+norm);

    }
}
