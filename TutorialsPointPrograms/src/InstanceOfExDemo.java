
public class InstanceOfExDemo extends InstanceOfEx	 {
	public static void main(String[] args) {
		InstanceOfEx a = new InstanceOfExDemo();
		boolean result = a instanceof InstanceOfExDemo;
		System.out.println(result);
	}
}
