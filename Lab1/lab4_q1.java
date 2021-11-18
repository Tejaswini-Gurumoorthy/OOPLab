import java.util.Scanner;

public class Lab4_q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of elements in the array : ");
        size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The prime numbers are : ");

        for (int i = 0; i < size; i++) {
            int j = 2;
            int num = a[i];
            int f = 1;
            if (a[i] == 0 || a[i] == 1) {
                continue;
            }
            while (j < a[i]) {
                if (num % j == 0) {
                    f = 0;
                    break;
                }
                j++;
            }
            if (f == 1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
