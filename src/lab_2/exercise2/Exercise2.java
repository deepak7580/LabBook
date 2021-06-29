package lab_2.exercise2;


import java.util.Arrays;

public class Exercise2 {
	String[] sortString(String[] arr)
	{	
		int length=arr.length;
		String[] s1=new String[length] ;
		Arrays.sort(arr);
		if(length%2==0)
		{
			for(int i=0;i<length/2;i++)
			{
				s1[i]=arr[i].toUpperCase();
			}
			for(int i=length/2;i<length;i++)
			{
				s1[i]=arr[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<length/2+1;i++)
			{
				s1[i]=arr[i].toUpperCase();
			}
			for(int i=length/2+1;i<length;i++)
			{
				s1[i]=arr[i].toLowerCase();
			}
			
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 a =new Exercise2();
		String[] arr= {"aab","aba","bc","mn"};
		String[] result=a.sortString(arr);
		System.out.println(Arrays.toString(result));
		
		
	}

}
