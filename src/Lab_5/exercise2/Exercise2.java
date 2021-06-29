package Lab_5.exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("eneter first name");
		String firstName=sc.nextLine();
		System.out.println("Enter the Last Name");
		String lastName =sc.nextLine();
		try {
			validateName(firstName,lastName);
		} catch (NameNotValid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void validateName(String firstName, String lastName) throws NameNotValid{
		if(firstName.isBlank() ||lastName.isBlank())
		{
			throw new NameNotValid("Name not valid");
		}
		else
		{
			System.out.println("Name valid");
		}
		
	}

}
