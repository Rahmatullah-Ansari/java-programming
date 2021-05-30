//mouse event.
import java.awt.*;  
import java.awt.event.*;  
public class mouse_event_handling extends Frame implements MouseListener{  
    Label lbl;
    public static final long serialVersionUID = 1L;  
    mouse_event_handling(){  
        addMouseListener(this);  
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
            System.exit(0);
            }
           });
        lbl=new Label();  
        lbl.setBounds(100,130,300,250);
        setBackground(Color.ORANGE);
        lbl.setAlignment(1);
        lbl.setBackground(Color.GRAY);
        lbl.setFont(new Font("Arial",Font.BOLD,35));  
        add(lbl);
        setBounds(150,150,500,500);  
        setSize(500,500);  
        setLayout(null);
        setResizable(false);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        lbl.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        lbl.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        lbl.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        lbl.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        lbl.setText("Mouse Released");  
    }
public static void main(String[] args) {  
    new mouse_event_handling(); 
}
}