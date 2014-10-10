/*
 * 1. Local variable are declared in methods , constructor , blocks
 * 2. Local variable are created when the method entered and destroyed on exit
 * 3. Access modifiers cannot be used for local variable.
 * 4. Visibility only local
 * 5. implemnted at STACK level internally
 * 6. There is no default value for local variables so local variiable should be declared and an inital value should be assigned before the first use.
 * 	
 */

public class LocalVariable {
	public void pupAge(){
		int age ;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
		
	}
	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.pupAge();
	}

}
