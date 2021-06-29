package Lab_5.exercise1;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<15)
		{
			  throw new AgeNotValid("!!!!Age not valid");

		}
		else
		{
			System.out.println("Vlid age");
		}
		
	}

}
