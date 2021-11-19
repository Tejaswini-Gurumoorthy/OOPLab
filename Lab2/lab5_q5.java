import java.util.Scanner;

class Sq
{
    int square(int a)
    {
        return a*a;
    }
    double square(double a)
    {
        return a*a;
    }
}
public class Lab5_q5
{
    public static void main(String args[])
    {
        Sq s1= new Sq();
        System.out.println("The square of 3 is "+s1.square(3));
        System.out.println("The square of 0.2 is "+s1.square(0.2));

    }
}
