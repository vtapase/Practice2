package Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaPract1 extends JavaPract4 {
	
	protected JavaPract1(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		
		int[] a1 = {1,2,3,2,1};
		int[] a2 = {1,2,3};
		int[] a3 = {1,2,3,4};
		
		sameorNot(a1,a2);
		ArrayList<Integer> num = new ArrayList<>();
	//	bubSort(num);
		
	}

	private static void sameorNot(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		
		Set<Integer> s = new HashSet<>();
	}
}
