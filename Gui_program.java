//two buttons program.
import java.awt.*;
import java.awt.event.*;
public class Gui_program{
    public static void main(String[] args) {
        Button b1,b2;
        Frame f1;
        Panel p1;
        f1=new Frame("Frame");
        f1.setVisible(true);
        f1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
            System.exit(0);
            }
           });
        p1 = new Panel();
        p1.setBounds(140,150,400,350);
        p1.setBackground(Color.blue);
        f1.setBackground(Color.CYAN);
        f1.add(p1);
        b1 = new Button("Button-1");
        b2 = new Button("Button-2");
        b1.setFont(new Font("Arial",Font.BOLD,30));
        b2.setFont(new Font("Arial",Font.BOLD,30));
        b1.setBounds(30,120,150, 100);
        b2.setBounds(220, 120, 150, 100);
        b1.setBackground(Color.ORANGE);
        b2.setBackground(Color.ORANGE);
        b2.setVisible(false);
        b1.setVisible(true);
        p1.add(b1);
        p1.add(b2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b2.setVisible(true);
                b1.setVisible(false);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b1.setVisible(true);
                b2.setVisible(false);
            }
        });
        p1.setLayout(null);
        f1.setLayout(null);
        f1.setSize(700,650);
    }
}
