import java.util.Scanner;

public class Lab4_q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the number of elements in the array 1 : ");
        n1 = sc.nextInt();
        int a1[] = new int[n1];


        System.out.println("Enter the elements of array 1  : ");
        for (int i = 0; i < n1; i++)
        {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in the array 2 : ");
        n2 = sc.nextInt();
        int a2[] = new int[n2];


        System.out.println("Enter the elements of array 2  : ");
        for (int i = 0; i < n2; i++)
        {
            a2[i] = sc.nextInt();
        }
        int n =n1 + n2;
        int a[] = new int[n];

        for (int i=0;i<n1;i++)
        {
            a[i]=a1[i];
        }
        int k =n1;
        for(int i=0;i<n2;i++)
        {
            a[k]= a2[i];
            k++;
        }
        System.out.println("The third array before sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("The third array after sorting : ");

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
