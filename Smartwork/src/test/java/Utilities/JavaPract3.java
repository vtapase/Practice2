package Utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaPract3 extends JavaPract2{
	
	protected JavaPract3(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

List<Integer> num1 = new ArrayList<>();


ArrayList<Integer> num = new ArrayList<>();

		num.add(7);
		num.add(2);
		num.add(9);
		num.add(4);
		num.add(5);
		num.add(8);
		num.add(1);
		num.add(7);
		num.add(2);
		num.add(9);
		num.add(4);
		num.add(5);
		
		
	
		
		
		String in = "TTeeeAMMMssAAkkKKKKKggSSS";
		
		char ar = ' ';
		
		char[] arr = in.toCharArray();
		
		String out = "";
		
		int count = 0;
		for(int i = 0 ;i < arr.length ; i++) {
		char a = arr[i];
			
			
			if(a == ar) {
				
				count ++;
			}
			else {
				count++;
				out = out + ar + count;
				count = 0;
			
			}
			
			ar = a;
			if(i == arr.length - 1) {
				count++;
				out = out + ar + count;
			}
			
		}
		
		System.out.println(out);
	}

	@Override
	void bubSort() {
		// TODO Auto-generated method stub
		
	}
}
