import java.util.Scanner;

public class FiveStrings
{
    public static void main(String[] args)
    {
        System.out.println("NAME : TEJASWINI GURUMOORTHY ");
        System.out.println("REG NO. : 200911202");
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the phone number");
        s=sc.next();
        String code;
        code= s.substring(1,4);
        String num1,num2;
        num1= s.substring(5,8);
        num2=s.substring(9,s.length());


        System.out.println("The area code is : ");
        System.out.println(code);
        System.out.println("The phone number is : ");
        System.out.println(num1.concat(num2));

    }
}
