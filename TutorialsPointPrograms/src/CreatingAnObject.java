
public class CreatingAnObject {
	
	int myAge;
	
	public CreatingAnObject(String name){
		//This constructor has one parameter name
		System.out.println("Passed name is : "+name );
	}
	

	public void setAge(int age){
		myAge = age;
	}
	
	public int getAge() {
		System.out.println("My age is : " + myAge);
		return myAge;
	}
	public static void main(String[] args) {
		
		//Object Creation
		CreatingAnObject object = new CreatingAnObject("Deepak");
		
		//Call to set myAge from setAge() method
		object.setAge(23);
		
		//Call another method to get Age detail
		object.getAge();
		
		System.out.println("Variable Value : " + object.myAge);
	}
}
