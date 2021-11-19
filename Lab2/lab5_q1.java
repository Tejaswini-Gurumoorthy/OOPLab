import java.util.Scanner;
class Result
{
    int mark_record[][]=new int [3][4];
    int total_marks[]= new int[3];
    String str[]=new String[4];

    Result()
    {
        str[0]="Roll no";
        str[1]="Subject 1";
        str[2]="Subject 2";
        str[3]="Subject 3";
        mark_record[0][0]=1;
        mark_record[1][0]=2;
        mark_record[2][0]=3;


    }


    void setMark_record()
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            for(int j=1;j<4;j++) {
                System.out.println("Subject "+j+" marks of Student " + (i+1) + " : ");
                mark_record[i][j] = sc.nextInt();
            }
        }
    }
    void setTotal_marks()
    {
        for (int i=0;i<3;i++)
        {
            total_marks[i]= mark_record[i][0]+mark_record[i][1]+mark_record[i][2];
        }

    }
    void subjectHigh()
    {
        for(int j=1;j<4;j++)
        {
            int max = mark_record[0][j];
            int imax=0;
            for (int i = 0; i < 3; i++)
            {
                if(mark_record[i][j]>max)
                {
                    max= mark_record[i][j];
                    imax=i;
                }
            }
            System.out.println("Roll number of the Student with the highest marks in Subject "+j+ " is "+(imax+1)+ " with marks "+max);
        }
    }
    void highestTotal()
    {
        int maxtotal=0;
        int maxrollno=0;
        for(int i=0;i<3;i++)
        {
            if(total_marks[i]>maxtotal)
            {
                maxtotal=total_marks[i];
                maxrollno=i;
            }
        }
        System.out.println("Roll number of the Student with the highest marks "+maxrollno+" with marks "+maxtotal);
    }
    void display()
    {
        for (int j=0;j<4;j++)
        {
            System.out.print(str[j]+"  ");
        }
        System.out.println();
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(mark_record[i][j]+"         ");
            }
            System.out.println();
        }
    }

}


public class Lab5_q1 {
    public static void main(String args[])
    {
        Result r1 = new Result();
        r1.setMark_record();
        r1.display();
        r1.setTotal_marks();
        r1.setTotal_marks();
        r1.subjectHigh();
        r1.highestTotal();

    }
