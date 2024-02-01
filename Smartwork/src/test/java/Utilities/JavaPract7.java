package Utilities;

import java.util.Arrays;

public class JavaPract7 {
	
	public static void main(String[] args) {
		 String a = "bcccdd";
	        String b = "bddccc";
	        
	       char[] ar =  a.toCharArray();
	       
	       char[] br =  b.toCharArray();
	       
	       Arrays.sort(ar);
	       Arrays.sort(br);
	  
	       System.out.println(Arrays.equals(ar,br));
	}

}
