interface Area{
    double findArea(int x,int y);
}
class Squ implements Area{
    @Override
    public double findArea(int x,int y) {
        return x*x;
    }

}
class Tri implements Area
{
    @Override
    public double findArea(int x, int y) {
        return 0.5*x*y;
    }
}
public class lab8_q2 {
    public static void main(String args[])
    {
        Squ s= new Squ();
        System.out.println("Area of the square is "+s.findArea(5,0));

        Tri t= new Tri();
        System.out.println("Area of the triangle is "+t.findArea(5,2));

    }
}
