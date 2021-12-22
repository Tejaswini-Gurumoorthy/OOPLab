import java.util.Scanner;

public class ArrayOfStrings
{
    public void arrange(String[] words, int n)
    {
        String temp=null;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(words[j-1].compareToIgnoreCase(words[j])>0)
                {
                    temp = words[j - 1];
                    words[j - 1] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("The words in alphabetical order : ");
        for(String i:words)
        {
            System.out.println(i);
        }

    }
    public static void main(String args[])
    {
        ArrayOfStrings a= new ArrayOfStrings();
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Number of words? ");
        n= sc.nextInt();
        String [] words= new String[n];
        System.out.println("Enter the words : ");
        for(int i=0;i<n;i++)
        {
            words[i]=sc.next();
        }
        System.out.println();
        a.arrange(words,n);


    }

}
