import java.util.Scanner;

public class FiveStrings
{
    public static void main(String[] args)
    {
        System.out.println("NAME : TEJASWINI GURUMOORTHY ");
        System.out.println("REG NO. : 200911202");
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3,s4,s5;
        System.out.println("Enter String 1");
        s1=sc.next();
        System.out.println("Enter String 2");
        s2=sc.next();
        System.out.println("Enter String 3");
        s3=sc.next();
        System.out.println("Enter String 4");
        s4=sc.next();
        System.out.println("Enter String 5");
        s5=sc.next();

        System.out.println("The final string is : ");
        System.out.println(s1.concat(s2).concat(s3).concat(s4).concat(s5));

    }
}
