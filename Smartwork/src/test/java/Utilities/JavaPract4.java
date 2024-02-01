package Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class JavaPract4 extends JavaPract3{

	
	protected JavaPract4(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		fibonnaci(15); 
		
		StringBuffer sb = new StringBuffer();
		ArrayList<Integer> num = new ArrayList<>();
		
		
	}

	private static void fibonnaci(int i) {
		// TODO Auto-generated method stub
		
		int first = 1 ;
		int second = 1 ;
		
		for(int j = 1 ; j < i ; j++ ) {
		if(j < 3) {
			System.out.println(first);
		}
		else {
		int num = first + second;
		first =second;
		second = num;
		System.out.println(second);
		}
		
		
	}
		return ;
}
}