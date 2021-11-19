import java.util.Scanner;

class IntArray
{
    int intArr[]= new int[10];

    IntArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for (int i=0;i<10;i++)
        {
            intArr[i]=sc.nextInt();
        }
    }
    void showArr()
    {
        for (int i=0;i<10;i++)
        {
            System.out.print(intArr[i]+"  ");
        }
        System.out.println();
    }
    void largest()
    {
        int max=intArr[0];
        for (int i=0;i<10;i++)
        {
            if(intArr[i]>max)
            {
                max=intArr[i];
            }
        }
        System.out.println("The largest element in the array is : "+max);
        System.out.println();
    }
    void avg()
    {
        float tot=0;
        float av;
        for (int i=0;i<10;i++)
        {
            tot+=intArr[i];
        }
        av= tot/10;
        System.out.println("The average is : "+av);
        System.out.println();
    }
    void arrange()
    {
        int temp;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(intArr[j]>intArr[j+1])
                {
                    temp=intArr[j];
                    intArr[j]=intArr[j+1];
                    intArr[j+1]=temp;
                }
            }
        }
        System.out.println("The array after sorting : ");
        showArr();
    }
}


public class Lab5_q2
{
    public static void main(String args[])
    {
        IntArray i1= new IntArray();
        i1.showArr();
        i1.largest();
        i1.avg();
        i1.arrange();
    }
