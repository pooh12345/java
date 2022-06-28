package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bScanner = new Scanner(System.in);
		String numString = bScanner.nextLine();
		//int test = Integer.parseInt(numString);
		
		if(numString.length() > 16) {
			
			System.out.println("error");
		}
		char a[] = numString.toCharArray();
		int sum = 0;
		ArrayList <Integer> aaArrayList = new ArrayList<Integer>();
		for(int i = a.length -2; i >= 0; i=i-2) {
			
			System.out.println(a[i]);
			
			
			sum = sum + getDigit(Character.getNumericValue(a[i]) *2);
			//aaArrayList.add(getDigit(Character.getNumericValue(a[i])) *2);
			
		}
		
		System.out.println(sum);
		
		int f = 0;
for(int i = a.length -1; i >= 0; i=i-2) {
			
			System.out.println(a[i]);
			
			
			f = f + getDigit(Character.getNumericValue(a[i]));
			f = f + getDigit(a[i]);
			//aaArrayList.add(getDigit(Character.getNumericValue(a[i])) *2);
			
		}
		
System.out.println(f);
		
		int b = sum + f;
		
		if(b % 10 == 0) {
			System.out.println("valid");
			
			if(numString.startsWith("4")) {
				System.out.println("Visa cards");
				
			}
	if(numString.startsWith("5")) {
		System.out.println("Master cards");
				
			}
	if(numString.startsWith("37")) {
		
		System.out.println(" American Express card");
	}
	if(numString.startsWith("6")) {
		System.out.println(" Discover cards");
		
	}
		}else {
			
			System.out.println("invalid");
			
		}
		
		
		

	}
	public static int getDigit(int number) 
    { 
        if (number < 9) 
            return number; 
        return number / 10 + number % 10; 
    } 

}
