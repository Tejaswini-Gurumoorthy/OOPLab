import java.util.Scanner;
import java.util.*;
public class FloatException extends Exception
{
    public FloatException(String s)
    {
        super(s);
    }
}


public class Input_Exception {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int num;
        while (true)
        {
            try {
                System.out.println("Enter number : ");
                num= sc.nextInt();

                if(num==-1)
                {
                    System.out.println(sum);
                    break;

                }
                sum+=num;

            }
            catch (FloatException e)
            {
                

            }



        }
    }
}
