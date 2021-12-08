public class Counter

{
  int cnt;
 static int objnum=0;
    {
        objnum++;
    }


    public static void main(String args[])
    {
        Counter s1= new Counter();
        Counter s2= new Counter();
        Counter s3= new Counter();
        System.out.println("The number of objects created : "+objnum);
    }
}
