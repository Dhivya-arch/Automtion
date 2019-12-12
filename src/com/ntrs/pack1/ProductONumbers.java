package com.ntrs.pack1;

public class ProductONumbers {

	public static void main(String[] args) {
		
		int[] a= {4,5,2,3}, b= new int[4];
		
	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				b[i]*=a[j];
			}
		}
		
		System.out.println("product of array");
		for(int k : b)
		{
			System.out.println(k);
		}
		String string = "animals";
		System.out.println("abc".endsWith("bc"));
		
	}

}
