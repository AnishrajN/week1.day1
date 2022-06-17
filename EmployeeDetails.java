package week1.day2;

public class EmployeeDetails {
	public void EmployeeName() {
		String empName = "Anish raj" ; 
		int empId = 4518 ;
		System.out.println("Employee Name is = " + empName);
		System.out.println("Employee ID is = " +empId);

	}
	public void EmployeeAddress() {
	    String empAddress = "chennai";
	    System.out.println("Employee Address is = "+ empAddress);

	}
	public void EmployeeSalary() {
		double empSalary = 67000.5345 ;
		System.out.println("Employee Salary is = "+ empSalary+" Rupees");

	}
	public void EmployeeMobileNumber() {
		long mobNumber = 866816884 ; 
		System.out.println("Employee Mobile NUmber is = "+ mobNumber);
		
	}
public static void main(String[] args) {
	EmployeeDetails ed = new EmployeeDetails();
	ed.EmployeeName();
	ed.EmployeeAddress();
	ed.EmployeeSalary();
	ed.EmployeeMobileNumber();
}
}
