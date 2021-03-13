package day25_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Arrays02 {

	public static void main(String[] args) {
		
		//verilen bir arrayde bir elemanin var olup olmadigini nasil konrtool ederiz?
		
		int arr[] = {10,25,3,16,75};
		System.out.println(Arrays.toString(arr));
		
		int sayi=11;
		
		boolean flag= false;
		
	  for (int i = 0; i < arr.length; i++) {
		  if(arr[i]==sayi) {
			  flag=true;
		  }
		
    	}
	  
	  if(flag) {
		  System.out.println("array sorulan elemani iceriyor");
	  }else {
		  System.out.println("array sorulan elemani icermiyor");
	  }
	  
	  

	}

}
