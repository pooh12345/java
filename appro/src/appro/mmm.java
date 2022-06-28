package appro;

import java.util.ArrayList;
import java.util.Scanner;

public class mmm {
	public static void main(String[] args) {
		
		Scanner bScanner = new Scanner(System.in);
		
		int bh1,bm1,eh1,em1;
		int bh2,bm2,eh2,em2;
		
		bh1=bScanner.nextInt();
		bm1=bScanner.nextInt();
		eh1=bScanner.nextInt();
		em1=bScanner.nextInt();
		bh2=bScanner.nextInt();
		bm2=bScanner.nextInt();
		eh2=bScanner.nextInt();
		em2=bScanner.nextInt();
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(); 
		
		arrlist.add(bh1);
		arrlist.add(bm1);
		arrlist.add(eh1);
		arrlist.add(em1);
		arrlist2.add(bh2);
		arrlist2.add(bm2);
		arrlist2.add(eh2);
		arrlist2.add(em2);
		
		ArrayList<Integer> fu = new ArrayList<Integer>(); 
		int a,b,c,d;
		boolean aa = false;
		boolean bb = false;
		boolean cc = false;
		boolean dd = false;
		
		int aaa[] = new int[2];
		
			if(bh1>bh2) {
				
				
				a=bh1;
				aa = true;
				fu.add(a);
				//fu.add(bm1);
				aaa[0] = bm1;
				
			}else {
				
				b=bh2;
				bb = true;
				fu.add(b);
				//fu.add(em1);
				aaa[0] = em1;
				
			}
			
		
		
			if(eh1<eh2) {
				
				c=eh1;
				cc = true;
				fu.add(c);
				//fu.add(bm2);
				aaa[1] = bm2;
			}else {
			
				d=eh2;
				dd = true;
				fu.add(d);
				//fu.add(em2);
				aaa[1] = em2;
				
			}
			
		if(fu.get(0) < fu.get(1)) {
			
			System.out.print(fu.get(0));
			if(fu.get(0) == bh1) {
				System.out.print(bm1);
				
			}
			
	if(fu.get(0) == eh1) {
				
		System.out.print(em1);
			}
			

	if(fu.get(0) == bh2) {
		System.out.print(bm2);
		
	}
	
if(fu.get(0) == eh2) {
		
System.out.print(em2);
	}
			
			
			
			
			
			
			
			
			System.out.print(fu.get(1));
			
			
		
				if(fu.get(1) == bh1) {
					System.out.print(bm1);
					
				}
				
		if(fu.get(1) == eh1) {
					
			System.out.print(em1);
				}
				

		if(fu.get(1) == bh2) {
			System.out.print(bm2);
			
		}
		
	if(fu.get(1) == eh2) {
			
	System.out.print(em2);
		}
				
			

			
			
			//System.out.print(fu.get(3));
			

			
			
			
			
		}else {
			
			
			System.out.print("000");
			System.exit(0);
			
		}
		
		
		/*if(bm1>bm2) {
			System.out.print(bm1);
			
			
		}else {
			System.out.print(bm2);
		
			
		}
		
		
		if(bm1>bm2) {
			System.out.print(bm1);
			
			
		}else {
			System.out.print(bm2);
		
			
		}
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	void print() {
		
		
		
		
		
		
		
		
		
		
	}

}
