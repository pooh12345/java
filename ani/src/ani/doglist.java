package ani;

public class doglist {
	
	private dog list[] = new dog[5];
	
	private int i=0;
	public void add(dog d) {
		
		
		if(i<list.length) {
			
			list[i] = d;
			
			System.out.println(i);
			
			System.out.println(d);
			
			
			i++;
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	

}
