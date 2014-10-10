
public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee emp  = new Employee("Deepak");
		Employee emp1  = new Employee("Rakesh");
		
		emp.setAge(23);
		emp.setDesgination("HR");
		emp.setSalary(50000);
		emp1.setAge(22);
		emp1.setDesgination("PROGRAMMER");
		emp1.setSalary(40000);
		
		emp.printEmployee();
		emp1.printEmployee();
		
	}
	

}
