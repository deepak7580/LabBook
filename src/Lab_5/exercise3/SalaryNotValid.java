package Lab_5.exercise3;

public class SalaryNotValid extends Exception {
	String msg;
	public SalaryNotValid(String msg) {
		super(msg);
		this.msg=msg;
		
		
		
	
	}
	 public String getMessage()
	 {
		return this.msg;
		 
	 }
	
}
