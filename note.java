import java.awt.*;
import javax.swing.*;
public class note{
    public static void main(String[] args) {
    JFrame f;
    JMenuBar mb;
    JMenu m1,m2,m3,m4,m5,m6;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32;
    JCheckBox c;
        f = new JFrame();
        f.setLayout(null);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2= new JMenu("Edit");
        m3 = new JMenu("Format");
        m4 = new JMenu("View");
        m5 = new JMenu("Help");
        m6 = new JMenu("Zoom");
        i1 =new JMenuItem("New                        Ctrl+N");
        m1.add(i1);
        i8 =new JMenuItem("New window        Ctrl+Shift+N");
        m1.add(i8);
        i2 =new JMenuItem("Open                      Ctrl+O");
        m1.add(i2);
        i3 =new JMenuItem("Save                       Ctrl+S");
        m1.add(i3);
        i4 =new JMenuItem("Save as...              Ctrl+Shift+S");
        m1.add(i4);
        i5 =new JMenuItem("Page Setup...");
        m1.add(i5);
        i6 =new JMenuItem("Print...                    Ctrl+P");
        m1.add(i6);
        i7 =new JMenuItem("Exit");
        m1.add(i7);
        i9=new JMenuItem("Undo     Ctrl+Z");
        m2.add(i9);
        i10 =new JMenuItem("Cut     Ctrl+X");
        m2.add(i10);
        i11 =new JMenuItem("Copy     Ctrl+C");
        m2.add(i11);
        i12=new JMenuItem("Paste     Ctrl+V");
        m2.add(i12);
        i13 =new JMenuItem("Delete     Del");
        m2.add(i13);
        i14=new JMenuItem("Search with Bing     Ctrl+E");
        m2.add(i14);
        i15 =new JMenuItem("Find     Ctrl+F");
        m2.add(i15);
        i16 =new JMenuItem("Find Next     F3");
        m2.add(i16);
        i17=new JMenuItem("Find Previous     Shift+F3");
        m2.add(i17);
        i18=new JMenuItem("Replace     Ctrl+H");
        m2.add(i18);
        i19=new JMenuItem("Go To     Ctrl+G");
        m2.add(i19);
        i20=new JMenuItem("Select All     Ctrl+A");
        m2.add(i20);
        i21 =new JMenuItem("Time/Date     F5");
        m2.add(i21);
        i22 =new JMenuItem("Word Wrap...");
        m3.add(i22);
        i23 =new JMenuItem("Font");
        m3.add(i23);
        i24 = new JMenuItem("Zoom In     Ctrl+Plus");
        m6.add(i24);
        i25 = new JMenuItem("Zoom Out     Ctrl+Minus");
        m6.add(i25);
        i26 =new JMenuItem("Restore Default Zoom     Ctrl+0");
        m6.add(i26);
        m4.add(m6);
        c = new JCheckBox("Status Bar");
        m4.add(c);
        i27 =new JMenuItem("View Help");
        m5.add(i27);
        i28 =new JMenuItem("Send Feedback");
        m5.add(i28);
        i29 = new JMenuItem("About Notepad");
        m5.add(i29);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        f.setJMenuBar(mb);
        f.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width =screenSize.getWidth();
        double height=screenSize.getHeight();
        f.setSize((int)(width/2),(int)(height/2));
        JTextArea tarea = new JTextArea("Hello");
        JScrollPane scrollpane = new JScrollPane();
        tarea.setForeground(Color.BLUE);
        tarea.setFont(new Font("Arial",Font.BOLD,30));
        tarea.setSize((int)width-20,(int)height-20);
        scrollpane.setSize(15,(int)height-20);
        f.add(tarea);
        f.add(scrollpane);
        // tarea.add(scrollpane);
        f.setVisible(true);
    }
}
