package t1;

import java.util.Arrays;
import java.util.LinkedList;

public class Dessert {
	
	private String name;
	private String category;
	private String storeName;
	private String calories;
	
	
	
	
	public Dessert(String data) throws DessertException  {
	
		try {
		String [] lineWords = data.split("\\,");
		
		

		// this.name=lineWords[0];
		 //this.category=lineWords[1];
		 //this.storeName=lineWords[2];
		 //this.calories= Float.valueOf(lineWords[3]);
		 LinkedList<String> names = new LinkedList<String>();

		 names.add(0, lineWords[0]);

		 names.add(1, lineWords[1]);
		 
		 names.add(2, lineWords[2]);
		 names.add(3, lineWords[3]);
		 
		 name=names.get(0);
				 category= names.get(1);
						 storeName= names.get(2);
								 calories=names.get(3);

		 
		 if(lineWords[0].equals("")||lineWords[1].equals("")||lineWords[2].equals("")||lineWords[3].equals("")) {
			 System.out.println( new DessertException("Missing Information"));
		 }
		
		 

			 
		
			 
			 
		
		 }catch (NumberFormatException e) {
			// throw new DessertException("e");
			 
			// System.out.println( new DessertException("Invalid Info"));
			 
			
		 }
		
	}
	public String getName() {
		return this.name;
		
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getCategory() {
		return this.category;
		
	}
	
	public void setCategory(String category) {
		this.category=category;
		
		
	}
	
	public String getStoreName() {
		return this.storeName;
		
		
	}
	
	public void setStoreName(String storeName) {
		
		this.storeName=storeName;
		
	}
	
	
	public String getCalories() {
		
		return this.calories;
	}
	
	public void setCalories(String calories) {
		
		this.calories=calories;
		
	}
	
	public String toString() {
		//return "Dessert"+ "["+"name:"+name +","+"category:"+category+","+"storeName:"+storeName+","+"calories:"+calories+"]";
		return "Dessert"+ "["+"name:"+getName() +","+"category:"+getCategory()+","+"storeName:"+getStoreName()+","+"calories:"+getCalories()+"]";
	}
	

}
