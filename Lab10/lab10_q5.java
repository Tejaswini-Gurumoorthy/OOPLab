import java.io.File;

public class FileHandling {
    public static void main(String args[])
    {
        File f= new File("/home/tejaswini/MANIPAL/SECOND YEAR/OOP");
        String s[]= f.list();
        for(String s1:s)
        {
            System.out.println(s1);
        }
    }
}
