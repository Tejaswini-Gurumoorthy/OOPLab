class Stack
{
    int top;
    int stk[];
    int size;
    Stack()
    {
        size=50;
        top=-1;
        stk = new int[50];
    }
    void push(int x)
    {
        if(top!=size)
        {
            stk[++top]=x;
        }
        else
        {
            System.out.println("STACK OVERFLOW !!!");
        }
    }
    void pop()
    {
        if(top!=-1)
        {
            top--;
        }
        else
        {
            System.out.println("STACK UNDERFLOW !!!");
        }
    }
    void show()
    {
        System.out.println("THE ELEMENTS IN THE STACK ARE : ");
        if(top!=-1)
        {
            for (int i = 0; i <= top; i++)
            {
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("NO ELEMENT TO BE SHOWN");
        }
    }
}
public class Lab5_q4
{
    public static void main(String args[])
    {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.show();
        s.pop();
        s.show();


    }
}
