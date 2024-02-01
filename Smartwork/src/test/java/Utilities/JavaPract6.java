package Utilities;

import java.util.Arrays;

public class JavaPract6 {

	public static void main(String[] args) {
		
		String a = "bcccdd";
		
		String b = "bdddcc";
		
		//System.out.println(angram(a,b));
		
char[] ar = a.toLowerCase().toCharArray();
		
		char[] br = b.toLowerCase().toCharArray();
		
		
		System.out.println(ar['b']++);
		
	}

	private static boolean angram(String a, String b) {
		// TODO Auto-generated method stub
		
		if(a.length() != b.length()) {
			return false;
		}
		
		char[] ar = a.toLowerCase().toCharArray();
		
		char[] br = b.toLowerCase().toCharArray();
		
		
		boolean isDisp = false;
		for(char c: ar) {
			
			for(char d : br) {
				
				if(c == d) {
					
					isDisp = true;
				}
			}
			
			if(!isDisp) {
				return false;
			}
		}
		return true;
		
		
	}
}
