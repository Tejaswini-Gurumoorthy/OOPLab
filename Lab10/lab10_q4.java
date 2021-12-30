import java.util.Scanner;
class MarkOutOfBoundException extends Exception
{
    public MarkOutOfBoundException(String s)
    {
        super(s);
    }
}

public class Student2 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int marks;
        try
        {
            System.out.println("Enter the marks : ");
            marks = sc.nextInt();
            if (marks > 100)
            {
                throw new MarkOutOfBoundException("Marks cannot exceed 100");

            }
            System.out.println("Mark scored : "+marks);

        }
        catch (MarkOutOfBoundException e)
        {
            System.out.println("Error : "+e.getMessage());
        }

    }
}
