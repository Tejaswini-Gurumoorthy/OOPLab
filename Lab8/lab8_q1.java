abstract class Ar
{
    abstract double area(int x,int y);
}
class Square extends Ar{
    @Override
    double area(int x,int y) {
        return x*x;
    }
}
class Triangle extends Ar{
    @Override
    double area(int x,int y) {
        return 0.5*x*y;
    }
}
public class lab8_q1
{
    public static void main(String args[])
    {
        Square s= new Square();
        System.out.println("Area of the square is "+s.area(5,0));

        Triangle t= new Triangle();
        System.out.println("Area of the triangle is "+t.area(5,2));

    }

}
