import java.util.Scanner;
class EvenNumberException extends Exception
{
    public EvenNumberException(String s)
    {
        super(s);
    }
}

public class lab10_q3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num;
        try {
            System.out.println("Enter the number : ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                throw new EvenNumberException("Even number cant be accepted");

            }
            System.out.println("The number you entered is : "+num);
        }
        catch(EvenNumberException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
