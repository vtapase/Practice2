package Utilities;

import java.util.Arrays;

public class JavaPract5 {

	
	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1,1,2,3,4,5,5,4,3,7,6,2};
		
		int[] arr1 = new int[arr.length];
		int count = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			boolean isdisp = false;
			
			for(int j = 0; j < arr.length ; j++ ) {
				
				if(!(i==j)) {
				
				if(arr[i] == arr[j]) {
					
					isdisp = true;
					break;
				}
				}
				
			}
			
			if(!isdisp) {
				
				arr1[count] = arr[i];
				count++;
			}
			
			
		}
		
		int[] arr2 = Arrays.copyOf(arr1, count);
	
		for(int c : arr2) {
			System.out.println(c);
		}
	}
}
