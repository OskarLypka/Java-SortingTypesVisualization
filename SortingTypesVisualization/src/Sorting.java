import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.math.*;
import java.time.*;


public class Sorting 
{
	
	Display sprite = new Display();
	
	
	
	//Sorting function.
	public void bubbleSort()
	{
		for(int i=0;i<sprite.getTableLength()-1;i++)
			for(int j=0;j<sprite.getTableLength()-i-1;j++)
				if(sprite.getHeight(j)>sprite.getHeight(j+1))
				{
					sprite.setColor(j, Color.RED);
					sprite.setColor(j+1, Color.RED);
					//A method making time delay.
					try{Thread.sleep(1);}
					catch(InterruptedException ex){Thread.currentThread().interrupt();}
					
					int temp = sprite.getHeight(j);
					
					sprite.setHeight(j, sprite.getHeight(j+1));
					sprite.setColor(j, Color.BLACK);
					
					sprite.setHeight(j+1, temp);
					sprite.setColor(j+1, Color.BLACK);
				}
	}
	
	//Sorting function.
	public void quickSort(int low, int high)
	{
		//A method making time delay.
		try{Thread.sleep(1);}
		catch(InterruptedException ex){Thread.currentThread().interrupt();}
		if(low < high)
		{
			int pivot = pratition(low, high);
			quickSort(low, pivot-1);
			quickSort(pivot+1, high);
		}
	}
	private int pratition(int low, int high)
	{
		int pivot = sprite.getHeight(high);
		int i = low - 1;
		
		for(int j=low; j<=high-1; j++)
		{
			sprite.setColor(j, Color.RED);
			//A method making time delay.
			try{Thread.sleep(1);}
			catch(InterruptedException ex){Thread.currentThread().interrupt();}
			if(sprite.getHeight(j) < pivot)
			{
				i++;
				int temp = sprite.getHeight(i);
				sprite.setHeight(i, sprite.getHeight(j));
				sprite.setHeight(j, temp);
			}
			sprite.setColor(j, Color.BLACK);
		}
		int temp2 = sprite.getHeight(i+1);
		sprite.setHeight(i+1, sprite.getHeight(high));
		sprite.setHeight(high, temp2);
		
		return i+1;
	}
	
	//Sorting function
	public void insertionSort()
	{
		int klucz, j;
		 
		for (int i=1;i<sprite.getTableLength();i++)
		{
			j=i;
			klucz=sprite.getHeight(i);
			
			while (j>0 && sprite.getHeight(j-1)>klucz)
			{
				sprite.setColor(j, Color.RED);
				//A method making time delay.
				try{Thread.sleep(1);}
				catch(InterruptedException ex){Thread.currentThread().interrupt();}
				sprite.setColor(j, Color.BLACK);
				sprite.setHeight(j, sprite.getHeight(j-1));
				j--;
				
			}
			
			sprite.setHeight(j, klucz);
		}
		
	}
	
	
	//A desorting function with speaks by itself.
		public void desorting()
		{
			//A method making time delay.
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

	//Returning size id table to the Main file.
	public int getTableLength(){return sprite.getTableLength();}
}


