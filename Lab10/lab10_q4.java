import java.util.Scanner;
import java.util.*;
class FloatException extends Exception
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
        float num;
        while (true)
        {
            try {
                System.out.println("Enter number : ");
                num = sc.nextFloat();

                int n = (int) num;
                if (num - n != 0) {
                    throw new FloatException("Float numbers invalid !!");
                }

                if (num == -1) {
                    System.out.println("Sum is : "+ sum);
                    break;

                }
                sum += num;
            }
            catch (FloatException f)
            {
                System.out.println("Error : "+f.getMessage());
            }





        }
    }
}
