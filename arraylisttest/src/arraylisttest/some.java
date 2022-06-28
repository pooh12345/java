package arraylisttest;
import java.util.*;
public class some {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> aaa = new ArrayList<String>();
		try {
		Scanner num = new Scanner(System.in);
		
		int a = num.nextInt();
		}catch(InputMismatchException e ) {
			
			
		}
		aaa.add(0,"jon");
		
		aaa.add(1,"jo");
		
		aaa.set(0,"che");
		
		//aaa.remove(0);
		for(String aa : aaa) {
			
			System.out.println(aa);
			
			
		}
		
		for(int i=0;i<aaa.size();i++) {
			
			
			System.out.println(aaa.get(i));
			
			
			
			
		}
		
		System.out.println(aaa);
		
		ArrayList<String> b = new ArrayList<String>();
		
		b.addAll(aaa);
		
		System.out.println(b);
		
		
		if(b.contains("jo")) {
			
			System.out.println("true");
			
			
		}
		
	//	aaa.clear();
		
		//if(aaa.isEmpty())
		
		
		
		
	}

}
