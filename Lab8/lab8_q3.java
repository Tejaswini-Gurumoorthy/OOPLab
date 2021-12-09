ort java.util.Scanner;

interface sports
{
    void getNumberOfGoals(int x);
    void dispTeam(String s);
}
class Hockey implements sports
{
    int goals;

    @Override
    public void getNumberOfGoals(int x) {
        goals =x;
    }

    @Override
    public void dispTeam(String s) {
        System.out.println(s +" team scored "+goals + " goals");
    }
}
class Football implements sports
{
    int goals;

    @Override
    public void getNumberOfGoals(int x) {
        goals =x;
    }

    @Override
    public void dispTeam(String s) {
        System.out.println(s +" team scored "+goals + " goals");
    }
}
public class lab8_q3
{
    public static void main(String args[]) {
        Hockey h = new Hockey();
        Football f = new Football();
        sports s;
        s=h;
        s.getNumberOfGoals(5);
        s.dispTeam("ABC");
        s=f;
        s.getNumberOfGoals(3);
        s.dispTeam("DEF");
    }
}
