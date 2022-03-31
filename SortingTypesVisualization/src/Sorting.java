import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.math.*;
import java.time.*;


public class Sorting 
{
	Display sprite = new Display();
	
	public void desorting()
	{
		try{Thread.sleep(2000);}
		catch(InterruptedException ex){Thread.currentThread().interrupt();}
		for(int i=0;i<400;i++)
		{
			Random rand = new Random();
			sprite.setColor(i, Color.RED);
			try{Thread.sleep(1);}
			catch(InterruptedException ex){Thread.currentThread().interrupt();}
			sprite.setHeight(i, rand.nextInt(550)+20);
			sprite.setColor(i, Color.BLACK);
		}
			
	}
	
	public void bubbleSort()
	{
		for(int i=0;i<400;i++)
			for(int j=0;j<399-i;j++)
				if(sprite.getHeight(j)>sprite.getHeight(j+1))
				{
					sprite.setColor(j, Color.RED);
					sprite.setColor(j+1, Color.RED);
					try{Thread.sleep(1);}
					catch(InterruptedException ex){Thread.currentThread().interrupt();}
					
					int temp = sprite.getHeight(j);
				
					
					sprite.setHeight(j, sprite.getHeight(j+1));
					sprite.setColor(j, Color.BLACK);
					
					sprite.setHeight(j+1, temp);
					sprite.setColor(j+1, Color.BLACK);
				}
	}
	public void quickSort()
	{
		for(int i=0;i<400;i++)
		{
			
		}
	}
	
	
	
	public void printList()
	{
		for(int i=0;i<400;i++)
			System.out.println(sprite.getHeight(i));
	}
}


