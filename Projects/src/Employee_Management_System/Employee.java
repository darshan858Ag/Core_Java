package Employee_Management_System;

public class Employee {

	String EmployeeName;
	double sal;
	final float bon=10000.0f;
	
	void setEmployeeData()
	{
		EmployeeName="Ankit";
		sal=25000;
	}
	void annualSal()
	{
		System.out.println("Employee Name is="+EmployeeName);
		System.out.println("Monthly salary is="+sal);
		System.out.println("Annual salary is="+sal*12);
		System.out.println("Annual salary with bonus"+(sal*12+(bon)));
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmployeeData();
		emp.annualSal();
	}
}
