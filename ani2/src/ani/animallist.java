package ani;

public class animallist {
	
	private animale[] list = new animale[5];
	
	private int i=0;
	
	
	public void add(animale d) {
	if (i<list.length) {
		
		list[i] = d;
		
		System.out.println(i);
		
		i++;
	}else{
			System.out.println("Array Full!");
			}
	
	
	}
	
	
}


