package t1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DessertReader   {
	private ArrayList <Dessert> foodList = new ArrayList <Dessert>();
	
	
	
	
	
	
	
	
	
	
public DessertReader() throws DessertException  {
	File f = new File("dessert.txt");
	boolean boo = false;
	int x =0;
	try {

		//BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line;
		
		//while ((line=br.readLine()) != null) {
		
		
		Scanner a = new Scanner(f);
		while(a.hasNext()) {
		String name = a.nextLine();
			
		foodList.add(new Dessert(name));
		
		
		//System.out.println(name);
		Dessert f1 = new Dessert(name);
		
		
		System.out.println(f1);
		
		}
		
		
	//	br.close();

		
		
		
		
		
		
		
	} catch (FileNotFoundException e) {
	
		
		System.out.println("Error: Can't find data file");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	
	
	
	
}
	
	public void print() throws DessertException {
		
		
		//for(Dessert c : foodList) {
			//System.out.println(c.toString());
			
		//}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
