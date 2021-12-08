import java.util.Scanner;

class Student_Detail
{
    String name;
    int id;
    static String college_name;

    Student_Detail()
    {

        college_name="MIT";
    }
    Scanner sc= new Scanner(System.in);
    void getData(Student_Detail s[],int size)
    {
        for (int i=0;i<size;i++)
        {
            System.out.println("STUDENT "+(i+1));
            System.out.println();
            System.out.println("Enter name");
            s[i].name = sc.next();
            System.out.println("Enter id");
            s[i].id = sc.nextInt();
        }
    }
    void display(Student_Detail s[],int size)
    {
        for (int i=0;i<size;i++)
        {
            System.out.println("STUDENT "+(i+1));
            System.out.println();
            System.out.println("NAME : " +s[i].name);
            System.out.println("ID: "+s[i].id);
            System.out.println("COLLEGE NAME: "+Student_Detail.college_name);
        }
    }


}
public class Lab8_q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter number of objects");
        size = sc.nextInt();
        Student_Detail s[]= new Student_Detail[size];
        for(int i=0;i<size;i++)
        {
           s[i]=new Student_Detail();
        }
        s[0].getData(s,size);
        s[0].display(s,size);


    }
