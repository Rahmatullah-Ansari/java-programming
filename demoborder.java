import java.awt.*;  
import javax.swing.*;  

public class demoborder 
{  
JFrame frame;  
demoborder()
{  
		frame=new JFrame();  

		JButton box1=new JButton("*NORTH*");;  
		JButton box2=new JButton("*SOUTH*");;  
		JButton box3=new JButton("*EAST*");;  
		JButton box4=new JButton("*WEST*");;  
		JButton box5=new JButton("*CENTER*");;  

		frame.add(box1,BorderLayout.NORTH);  
		frame.add(box2,BorderLayout.SOUTH);  
		frame.add(box3,BorderLayout.EAST);  
		frame.add(box4,BorderLayout.WEST);  
		frame.add(box5,BorderLayout.CENTER);  
		frame.setSize(500,500);  
		frame.setVisible(true);  
}  
public static void main(String[] args) 
{  
    new demoborder();  
}  
}