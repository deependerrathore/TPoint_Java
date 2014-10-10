/*
 * CALLED BY - className.VariableName
 * Static variable created at program start and destroyed when program ends.
 * CONSTANT - public /private final static.
 */
public class ClassVariable {
	//salary variable is private stativ variable
	private static double salary;
	
	//DEPARTMENT is a constatnt
	public static final String DEPARTMENT = "Development";
	
	public static void main(String[] args) {
		salary =100;
		System.out.println("DEPARTMENT name is : " + DEPARTMENT);
	}
	
}
