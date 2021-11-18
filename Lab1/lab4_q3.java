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
        System.out.println("Enter the element to be searched : ");
        int ele = sc.nextInt();
        int cnt=0;

        for(int i=0;i<size;i++)
        {
            if(a[i]==ele)
            {
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.println("ELEMENT NOT FOUND !!");
        }
        else
        {
            System.out.println(ele + " occurs "+cnt+" times.");
        }
    }
}
