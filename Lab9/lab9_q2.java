import java.util.Scanner;
import java.lang.String;

class Student
{
    int regno;
    String firstName;
    String lastName;
    String degree;

    void getData(Student s[])
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("FOR STUDENT "+(i+1) + " : ");
            System.out.println("Enter Registration Number : ");
            s[i].regno= sc.nextInt();
            System.out.println("Enter First Name : ");
            s[i].firstName= sc.next();
            System.out.println("Enter last name : ");
            s[i].lastName= sc.next();
            System.out.println("Enter degree : ");
            s[i].degree= sc.next();
            System.out.println();
            System.out.println();
        }
    }
    void search(Student s[])
    {
        int ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("How do you want to search ? ");
        System.out.println("1. By First name");
        System.out.println("2. By Last name");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                String fname;
                System.out.println("Enter the first name : ");
                fname=  sc.next();
                for(int i=0;i<10;i++)
                {
                    if (fname.compareToIgnoreCase(s[i].firstName)==0)
                    {
                        System.out.println();
                        System.out.println("Details :");
                        {
                            System.out.println("Reg number : "+s[i].regno);
                            System.out.println("First Name : "+s[i].firstName);
                            System.out.println("Last Name : "+s[i].lastName);
                            System.out.println("Degree : "+s[i].degree);
                            System.out.println();
                        }
                    }
                }
            case 2:
                String lname;
                System.out.println("Enter the last name : ");
                lname=  sc.next();
                for(int i=0;i<10;i++)
                {
                    if (lname.compareToIgnoreCase(s[i].lastName)==0)
                    {
                        System.out.println();
                        System.out.println("Details :");
                        {
                            System.out.println("Reg number : "+s[i].regno);
                            System.out.println("First Name : "+s[i].firstName);
                            System.out.println("Last Name : "+s[i].lastName);
                            System.out.println("Degree : "+s[i].degree);
                            System.out.println();
                        }
                    }
                }

        }

    }


}
public class StudentSearch
{
    public static void main(String args[])
    {
        Student s[]= new Student[10];
        for (int i=0;i<10;i++)
        {
            s[i]=new Student();
        }
        s[0].getData(s);
        s[0].search(s);


    }
}
