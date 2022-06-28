import java.util.Arrays;
import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = new int[3];

char[] ch = new char[3];
Scanner sc = new Scanner(System.in);
for(int i = 0 ;i < num.length;i++) {
	
	num[i] = sc.nextInt();
	
}

for(int i = 0 ;i < num.length;i++) {
	
	ch[i] = sc.next().charAt(0); 
	
}
		
		
Arrays.sort(num);
		
for(int i = 0 ;i < num.length;i++) {
	
	if(ch[i] == 'a')
		System.out.println(num[0]);
		
	else if(ch[i] == 'b')
		System.out.println(num[1]);
	
	
	else
		System.out.println(num[2]);
	
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
