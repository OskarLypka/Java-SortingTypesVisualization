import java.awt.*;
import java.util.HashMap;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.math.*;


public class Main 
{
	public static void main(String[] args) 
	{
		Sorting sort = new Sorting();
		//Look at the command line!
		System.out.println("Pick your favourite sorting type:\n1.Bubble\n2.QuickSort\n3.InsertionSort");
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			int i = scanner.nextInt();
			switch(i)
			{
			case 1:
				sort.bubbleSort();
				break;
			case 2:
				sort.quickSort(0,sort.getTableLength()-1);
				break;
			case 3:
				sort.insertionSort();
				break;
			}
			sort.desorting();			
		}
	}
}
