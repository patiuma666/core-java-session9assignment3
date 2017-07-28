package employeeExample;

public class EmployeeDemo {  //creating EmployeeDemo class
	public static void main(String[] args) { //creating a main method 
		
		                                 //Creating object of the permanentEmp and passing the arguments
		PermanentEmp p= new PermanentEmp(1234,"uma",21,15000.00);
		System.out.println("details of permanent employee  are :");
		                                            
		System.out.println("Id  =" + p.empId);// displaying the details
		System.out.println("name =" + p.empName);
		System.out.println("leave =" + p.Total_Leaves);
		
		p.calculate_balanceLeaves();
		p.avail_leave(20, (char)0);
		p.calculate_salary();
		                            
	System.out.println("...................");

	                            	//Creating object of the permanentEmp and passing the arguments
		TemporaryEmp t= new TemporaryEmp(2326,"shanti",20,30000.00);
		System.out.println(" details of Temprory employee are :");
		
		System.out.println("Id  =" + t.empId);//printing  the details
		System.out.println("name =" + t.empName);
		System.out.println("leave =" + t.Total_Leaves);
		
		t.calculate_balanceLeaves();//displaying the method details
		t.avail_leave(22, (char)0);
		t.calculate_salary();

	}


}
