package lab_2.exercise3;

import java.util.Arrays;

public class Reverse {
	public static int[] getSorted(int[] arr)
	{
		StringBuilder sb=new StringBuilder();
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
			sb=sb.reverse();
			arr1[i]=Integer.parseInt(sb.toString());
			System.out.println(sb.length());
		sb.setLength(0);
		System.out.println(sb.length());
		}
		
		Arrays.sort(arr1);
		
		return arr1;
		
	}
	public static void main(String args[])
	{
		int[]arr= {124,546,879,876};
		int[] result=getSorted(arr);
		System.out.println(Arrays.toString(result));
	}
}
