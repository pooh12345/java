package t1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DessertReader   {
	private ArrayList <Dessert> foodList = new ArrayList <Dessert>();
	
	
	
	
	
	
	
	
	
public DessertReader() throws DessertException  {
	
	try {

		File f = new File("dessert.txt");
		Scanner a = new Scanner(f);
		while(a.hasNext()) {
		String name = a.nextLine();
	
		foodList.add(new Dessert(name));
		
		
		
		
		System.out.println(new Dessert(name));
		
		
		}
		
		a.close();

		
		
		
		
		
		
		
	} catch (FileNotFoundException e) {
	
		
		System.out.println("Error: Can't find data file");
	}

	
	
	
	
	
	
}
	
	public void print() throws DessertException {
		
		
		for(Dessert c : foodList) {
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
