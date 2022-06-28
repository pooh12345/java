package t1;

import java.util.Arrays;

public class Dessert {
	
	private String name;
	private String category;
	private String storeName;
	private float calories;
	
	
	
	
	public Dessert(String data) throws DessertException  {
		
		String [] lineWords = data.split("\\,");
		
		

		 this.name=lineWords[0];
		 this.category=lineWords[1];
		 this.storeName=lineWords[2];
		
		 
		 if(lineWords[0].equals("")||lineWords[1].equals("")||lineWords[2].equals("")||lineWords[3].equals("")) {
			 System.out.println( new DessertException("Missing Information"));
		 }
		 try {
		 

			 
		
			 this.calories= Float.valueOf(lineWords[3]);
			 
		 
		 }catch (NumberFormatException e) {
			 
			 System.out.println( e.getMessage());
			 System.out.println( new DessertException("Invalid Info"));
			 
			
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
	
	
	public float getCalories() {
		
		return this.calories;
	}
	
	public void setCalories(float calories) {
		
		this.calories=calories;
		
	}
	
	public String toString() {
		//return "Dessert"+ "["+"name:"+name +","+"category:"+category+","+"storeName:"+storeName+","+"calories:"+calories+"]";
		return "Dessert"+ "["+"name:"+getName() +","+"category:"+getCategory()+","+"storeName:"+getStoreName()+","+"calories:"+getCalories()+"]";
	}
	

}
