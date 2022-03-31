import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.math.*;
import java.time.*;


public class Sorting 
{
	
	Display sprite = new Display();
	
	//A desorting function with speaks by itself.
	public void desorting()
	{
		//A method making time delay.
		try{Thread.sleep(4000);}
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
	
	//Sorting function.
	public void bubbleSort()
	{
		for(int i=0;i<400;i++)
			for(int j=0;j<399-i;j++)
				if(sprite.getHeight(j)>sprite.getHeight(j+1))
				{
					sprite.setColor(j, Color.RED);
					sprite.setColor(j+1, Color.RED);
					//Time delay.
					try{Thread.sleep(1);}
					catch(InterruptedException ex){Thread.currentThread().interrupt();}
					
					int temp = sprite.getHeight(j);
				
					
					sprite.setHeight(j, sprite.getHeight(j+1));
					sprite.setColor(j, Color.BLACK);
					
					sprite.setHeight(j+1, temp);
					sprite.setColor(j+1, Color.BLACK);
				}
	}

	
	//Printing height of sprites.
	public void printList()
	{
		for(int i=0;i<400;i++)
			System.out.println(sprite.getHeight(i));
	}
}


