import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.math.*;


public class Display implements ActionListener
{
	//A class displaying all of the sprites.
	JPanel[] panels = new JPanel[400];
	Display()
	{
		
		//Declaring them.
		for(int i=0;i<panels.length;i++)
		{
			Random rand = new Random();
			panels[i]= new JPanel();
			panels[i].setBackground(Color.black);
			panels[i].setBounds(i*3,0,2, rand.nextInt(550)+20);
		}
		
		//Setting window.
		JFrame frame = new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1215,700);
		frame.setVisible(true);
		
		//Printing.
		for(int i=0;i<panels.length;i++)
		{
			frame.add(panels[i]);
		}
		
	}	
	public void actionPerformed(ActionEvent e){}
	
	public int getHeight(int i){return panels[i].getHeight();}
	public void setHeight(int i, int height){panels[i].setSize(2, height);}
	public void setColor(int i, Color color){panels[i].setBackground(color);}
	public int getTableLength() {return panels.length;}
}
