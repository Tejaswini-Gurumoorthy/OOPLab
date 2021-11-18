import java.util.Scanner;

public class Lab4_q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of elements in the array : ");
        size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        int max= a[0];
        int min = a[0];

        for(int i=0;i<size;i++)
        {
            if(a[i]>max)
            {
                max= a[i];
            }
            else if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("The largest element is : "+ max);
        System.out.println("The smallest element is : "+min);

    }
}
