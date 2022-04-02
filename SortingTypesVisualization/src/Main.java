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

		sort.quickSort(0,399);
		sort.desorting();
		sort.bubbleSort();
		sort.desorting();
		
	}
}
