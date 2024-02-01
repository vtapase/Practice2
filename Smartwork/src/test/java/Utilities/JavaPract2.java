package Utilities;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public abstract class JavaPract2 {

	int a ;
	protected JavaPract2(int a) {
		this.a = a;
		
	}
	
	private JavaPract2(int a, int b) {
		this.a = a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> num = List.of(7,2,9,4,5,8,1,7);
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
		
		//bubSort(num);
		
		System.out.println(num);
	}

	protected void bubSort(ArrayList<Integer> num) {
		// TODO Auto-generated method stub
		int a = num.size() ;
		for(int i = num.size()-1  ; i >= 0; i--) {
			
			for(int j = i - 1 ; j >= 0 ; j--) {
				
				if(num.get(i) < num.get(j)) {
					
					swap(num , i , j);
				}
			}
		}
	}
	
	abstract void bubSort();

	private static void swap(ArrayList<Integer> num, int i, int j) {
		// TODO Auto-generated method stub
		int temp = num.get(i);
		num.set(i, num.get(j));
		num.set(j,temp);
	
	}

}
