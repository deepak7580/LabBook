package lab_2.exercise1;

import java.util.Arrays;

public class SmallestElement {
	
	int getSecondSmallest(int arr[])
	{
		int smallNum=0;
		Arrays.sort(arr);
		smallNum=arr[0];
		return smallNum;
		
	}

	public static void main(String[] args) {
		SmallestElement se =new SmallestElement();
		int[] arr= {23,56,78,98,1};
		System.out.println("smallest number is "+se.getSecondSmallest(arr));

	}

}
