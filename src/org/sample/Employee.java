package org.sample;

//import packageName.ClassName;
import org.base.Client;

public class Employee {
	// step 4 method creation
	private void empId() {
		System.out.println("Employee id is : 67534");
	}
	private void empName() {
		System.out.println("Employee name is : Jack");
	}
	// step 5 main method creation

	public static void main(String[] args) {

		// step6 object creation
		// ClassName objectName = new ClassName();
		Employee e = new Employee();

		// step 7 method calling
		// objectName.methodName();
		e.empId();
		e.empName();

		// ClassName objectName = new ClassName();
		Company p = new Company();
		// objectName.methodName();
		p.compId();
		p.compName();

		// ClassName objectName = new ClassName();
		Client t = new Client();
		// objectName.methodName();
		t.clientId();
		t.clientName();

	}

}
