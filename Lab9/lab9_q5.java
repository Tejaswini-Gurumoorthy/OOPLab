import java.util.Scanner;

public class FiveStrings
{
    public static void main(String[] args)
    {
        System.out.println("NAME : TEJASWINI GURUMOORTHY ");
        System.out.println("REG NO. : 200911202");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five letter word ");
        char a[]=sc.next().toCharArray();

        for(char c1:a)
        {
            for(char c2:a)
            {
                for(char c3:a)
                {
                    if(!(c1==c2 || c2==c3 || c1==c3))
                    {
                        System.out.println(""+c1+c2+c3);
                    }
                }
            }
        }


    }
}
