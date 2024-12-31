package EncapsulationGetterSetter;

public class EmployeeMainClass {
	
	public static void main(String[] args) {
		

	Employee e1=new Employee();
	e1.setName("Darshan");
	e1.setId(1);
	e1.setSalary(25000f);
	
	System.out.println(e1.getName());
	System.out.println(e1.getId());
	System.out.println(e1.getSalary());
}
}
