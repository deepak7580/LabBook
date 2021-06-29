package Lab_5.exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your salary");
		int salary=sc.nextInt();
		try
		{
		validateSalary(salary);
		}catch(SalaryNotValid e)
		{
			System.out.println(e.getMessage());
		}

	}

	private static void validateSalary(int salary) throws SalaryNotValid {
		if(salary<3000)
		{
			throw new SalaryNotValid("salary not valid");
		}
		else
		{
			System.out.println("valid salary");
		}
		
	}

}
