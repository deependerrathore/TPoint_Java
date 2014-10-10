import java.io.*;
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//This is the constructor of the class Employee
	public Employee(String name){
		this.name = name;
	}
	
	//Assign the age of the employee to the variable age.
	public void setAge(int age){
		this.age = age;
	}
	
	//Assign the designation of the employee to the variable designation
	public void setDesgination(String desig){
		this.designation = desig;
	}
	//Assing the salary of the employee to the variable salary
	public void setSalary(double sal){
		this.salary = sal;
	}
	
	public void printEmployee(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Designation : "+designation);
		System.out.println("Salary :  "+salary);
	}
}
