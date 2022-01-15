import java.util.Scanner;
class NegativeArray extends Exception
{
    public NegativeArray(String s)
    {
        super(s);
    }
}

public class lab10_q2
{
    public static void main(String args[])
    {
        System.out.println("NAME : TEJASWINI GURUMOORTHY");
        System.out.println("REG NO. : 20091102");
        Scanner sc= new Scanner(System.in);
        int size;
        try {
            System.out.println("Enter the size of array : ");
            size = sc.nextInt();
            if (size < 0) {
                throw new NegativeArray("Size of array cannot be negative !!!");
            }
            int arr[] = new int[size];
            System.out.println("Enter array elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The elements of array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        catch (NegativeArray n)
        {
            System.out.println("Error : "+n.getMessage());
        }
    }
}
