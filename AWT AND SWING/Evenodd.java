import java.awt.*;
import java.awt.event.*;
class Evenodd extends Frame implements ActionListener
{
TextField t1,t2;
Label l1,l2;
Button b1;
public Evenodd()
{
setTitle("Even & odd");
l1=new Label("Number");
l2=new Label("Result");
t1=new TextField(20);
t2=new TextField(20);
b1=new Button("click");
setLayout(new FlowLayout());
add(l1);
add(l2);
add(t1);
add(t2);
add(b1);
b1.addActionListener (this);
setSize(400,400);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int num=Integer.parseInt(t1.getText());
if(num%2==0)
{
t2.setText("Even");
}
else
{
t2.setText("odd");
}
}
}

public static void main (String args[])
{
Evenodd ob =new Evenodd();
}
}
