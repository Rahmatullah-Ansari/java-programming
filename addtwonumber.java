import java.awt.event.*;
import javax.swing.*;
public class addtwonumber extends JFrame implements ActionListener {
    JButton jb1;
    JTextField jt1,jt2;
    JLabel lb1;
    addtwonumber(){
        jt1=new JTextField();
        jt1.setBounds(90,50,150,30);
        add(jt1);
        jt2=new JTextField();
        jt2.setBounds(90,80,150,30);
        add(jt2);
        lb1=new JLabel("Result :");
        lb1.setBounds(90,140,150,30);
        add(lb1);
        jb1=new JButton("+");
        jb1.setBounds(90,200, 100,30);
        add(jb1);
        jb1.addActionListener(this);
        setLayout(null);
        setSize(600,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(jt1.getText());
        int b=Integer.parseInt(jt2.getText());
        int c=0;
        if(e.getSource().equals(jb1)){
            c=a+b;
            lb1.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args) {
        new addtwonumber();
    }
}
