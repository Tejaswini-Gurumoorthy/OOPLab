import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWordSwing
{
    public static void main(String args[])
    {
        Count obj= new Count();
    }

}
class Count extends JFrame implements ActionListener
{
    JTextField t1;
    JLabel j;
    JButton b;

    public Count()
    {
        t1=new JTextField(20);
        j=new JLabel("Counter");
        b= new JButton("Count");

        add(t1);
        add(j);
        add(b);

        b.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n1= Integer.parseInt(t1.getText());
        int value = n1+6;
        j.setText(value+"");


    }

}
