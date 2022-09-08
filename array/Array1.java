package com.array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-3,-6,3,4,6,-7,1,2,8,-0,-8,-5,7,9,0};
		
		System.out.println("output of largest :" + largest(arr) );
		System.out.println("output of largest :" + smallest(arr));
	}

	public static String smallest(int[] arr) {
		// TODO Auto-generated method stub
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
			{
			if(small>arr[i])
			
		      small=arr[i];
			}
		return null;
	}

	public static String largest(int[] arr) {
		// TODO Auto-generated method stub
		int large =arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(large<arr[i])
				
				large=arr[i];
		}
		
		return null;
	}

}
